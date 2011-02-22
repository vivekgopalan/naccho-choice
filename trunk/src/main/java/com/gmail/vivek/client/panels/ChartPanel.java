package com.gmail.vivek.client.panels;

import java.util.Iterator;
import java.util.Vector;

import com.gmail.vivek.client.Mediator;
import com.gmail.vivek.client.interfaces.UpdateableContents;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class ChartPanel extends Composite implements UpdateableContents, ChangeHandler{
    VerticalPanel vp = new VerticalPanel();
	private ListBox indicatorsSelctionLb;
	private SimplePanel mapCanvas;
	private OutputPanel outputPanel;
	private ListBox plotTypeSelctionLb;
    
	public ChartPanel(OutputPanel outputPanel) {
		HorizontalPanel controlsPanel = new HorizontalPanel();
		
		this.outputPanel = outputPanel;
		mapCanvas = new SimplePanel();
		
		plotTypeSelctionLb = new ListBox();
		plotTypeSelctionLb.addItem("pie chart");
		plotTypeSelctionLb.addItem("line chart");
		
		indicatorsSelctionLb = new ListBox();
		
		indicatorsSelctionLb.addChangeHandler(this);
		plotTypeSelctionLb.addChangeHandler(this);
		controlsPanel.add(indicatorsSelctionLb);
		controlsPanel.add(plotTypeSelctionLb);
		

		
		vp.add(controlsPanel);
		vp.add(mapCanvas);
		initWidget(vp);
	}

	public void onChange(ChangeEvent event) {
		updateContents();
	}

	public void updateContents() {
		String selecteIndicator = getSelectedIndicator();
		String plotType = getPlotType();
		outputPanel.createAndShowChart(selecteIndicator,plotType);
	}

	public void updateCanvas(Widget viewWidget) {
		mapCanvas.setWidget(viewWidget);
	}
	
	public boolean containsCanvas() {
		if (mapCanvas.getWidget() == null) return false;
		else return true;
	}

	public void updateIndicatorLb(Vector<String> indicators) {
		indicatorsSelctionLb.clear();
		for (Iterator iterator = indicators.iterator(); iterator.hasNext();) {
			String value = (String) iterator.next();
		    indicatorsSelctionLb.addItem(value);	
		}
	}
	public String getSelectedIndicator() {
		return indicatorsSelctionLb.getItemText(indicatorsSelctionLb.getSelectedIndex());
	}
	
	public String getPlotType() {
		// TODO Auto-generated method stub
		return plotTypeSelctionLb.getSelectedIndex() == 0 ? "pie" :"line";
	}

}
