package com.gmail.vivek.client.panels;

import java.util.HashMap;

import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.drop.HorizontalPanelDropController;
import com.allen_sauer.gwt.dnd.client.drop.VerticalPanelDropController;
import com.gmail.vivek.client.Mediator;
import com.gmail.vivek.client.callbacks.DataServiceCallBack;
import com.gmail.vivek.client.services.DataService;
import com.gmail.vivek.client.services.DataServiceAsync;
import com.gmail.vivek.server.DataParser;
import com.gmail.vivek.shared.InputOptions;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class InputPanel extends VerticalPanel implements  ClickHandler {

	private VerticalPanel characteristicsTable;
	private VerticalPanel indicatorsTable;
	private PickupDragController characteristicWidgetDragController;
	private PickupDragController indicatorWidgetDragController;


	public InputPanel() {

		
		HTML characteristicsQuestion = new HTML("Characteristic of Interest");
		HTML indicatorQuestion = new HTML("Health Outcome Indicators");
		
		
		// Finalcial Input options
		
		AbsolutePanel characteristicBoundaryPanel = new AbsolutePanel();
	    characteristicBoundaryPanel.setSize("100%", "100%");
	    
	    AbsolutePanel indicatorBoundaryPanel = new AbsolutePanel();
	    indicatorBoundaryPanel.setSize("100%", "100%");


	     characteristicWidgetDragController = new PickupDragController(RootPanel.get(), false);
	    characteristicWidgetDragController.setBehaviorMultipleSelection(false);
	    
	    indicatorWidgetDragController = new PickupDragController(RootPanel.get(), false);
	    indicatorWidgetDragController.setBehaviorMultipleSelection(false);
	    indicatorWidgetDragController.setBehaviorDragProxy(true);
	    
	     characteristicsTable = new VerticalPanel();
	     VerticalPanelDropController characteristicsWidgetDropController = new VerticalPanelDropController(characteristicsTable);
	      characteristicWidgetDragController.registerDropController(characteristicsWidgetDropController);
	      
	       indicatorsTable = new VerticalPanel();
		     VerticalPanelDropController indicatorWidgetDropController = new VerticalPanelDropController(indicatorsTable);
		      indicatorWidgetDragController.registerDropController(indicatorWidgetDropController);
	      
		
		 characteristicBoundaryPanel.add(characteristicsTable);
		indicatorBoundaryPanel.add(indicatorsTable);
		
		
		HTML healthDepartmentHTML = new HTML("Health Department");;
		add(healthDepartmentHTML );
		add(characteristicsQuestion);
		
		ScrollPanel sp = new ScrollPanel();
		sp.setWidget(characteristicBoundaryPanel);
		sp.setHeight("200px");
		add(sp);
		
		add(indicatorQuestion);
		add(indicatorBoundaryPanel);
		
		
		healthDepartmentHTML.setStyleName("input_panel_heading");
		healthDepartmentHTML.setStyleName("input_panel_top_topic");
characteristicsQuestion.setStyleName("input_panel_heading");
indicatorQuestion.setStyleName("input_panel_heading");

		characteristicsTable.setStyleName("input_panel_options");
		indicatorsTable.setStyleName("input_panel_options");
	
		setStyleName("input_panel");
		Mediator.getInstance().registerCharacteristicDropController(characteristicWidgetDragController);
		Mediator.getInstance().registerIndicatorDropController(indicatorWidgetDragController);

		
	}

public void update(HashMap<String, String[]> h) {
	String[] characteristics = h.get("characteristics");
	if (characteristics != null) {
	 for (int i = 0; i < characteristics.length; i++) {
			HTML w = new HTML(characteristics[i]);
			characteristicsTable.add(w);
			characteristicWidgetDragController.makeDraggable(w);
		}
	}
	 String[] indicatiors = h.get("indicators");
		if (indicatiors != null) {

	 for (int i = 0; i < indicatiors.length; i++) {
			HTML w = new HTML(indicatiors[i]);
			indicatorsTable.add(w);
			indicatorWidgetDragController.makeDraggable(w);
		}
		}
		
	
	
}
	public void onClick(ClickEvent event) {
	
		
		InputOptions inputOptions = null;
		DataService.App.getInstance().processData(inputOptions, new DataServiceCallBack());
	}
}
