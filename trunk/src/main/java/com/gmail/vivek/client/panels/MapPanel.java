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

public class MapPanel extends Composite implements UpdateableContents, ChangeHandler{
    VerticalPanel vp = new VerticalPanel();
	private ListBox indicatorsSelctionLb;
	private ListBox mapTypeSelctionLb;
	private SimplePanel mapCanvas;
	private OutputPanel outputPanel;
    
	public MapPanel(OutputPanel outputPanel) {
		HorizontalPanel controlsPanel = new HorizontalPanel();
		
		this.outputPanel = outputPanel;
		mapCanvas = new SimplePanel();
		indicatorsSelctionLb = new ListBox();
		mapTypeSelctionLb = new ListBox();
		mapTypeSelctionLb.addItem("state view");
		mapTypeSelctionLb.addItem("city view");
		
		
		indicatorsSelctionLb.addChangeHandler(this);
		mapTypeSelctionLb.addChangeHandler(this);
		controlsPanel.add(indicatorsSelctionLb);
		controlsPanel.add(mapTypeSelctionLb);
		
		vp.add(controlsPanel);
		vp.add(mapCanvas);
		initWidget(vp);
	}

	public void onChange(ChangeEvent event) {
		updateContents();
	}

	public void updateContents() {
		String selecteIndicator = getSelectedIndicator();
		String mapType = getMapType();
		outputPanel.createAndShowMap(selecteIndicator,mapType);
	}

	public String getSelectedIndicator() {
		return indicatorsSelctionLb.getItemText(indicatorsSelctionLb.getSelectedIndex());
	}

	public void updateCanvas(Widget viewWidget) {
		mapCanvas.setWidget(viewWidget);
	}

	public void updateIndicatorLb(Vector<String> indicators) {
		indicatorsSelctionLb.clear();
		for (Iterator iterator = indicators.iterator(); iterator.hasNext();) {
			String value = (String) iterator.next();
		    indicatorsSelctionLb.addItem(value);	
		}
	}

	public String getMapType() {
		// TODO Auto-generated method stub
		return mapTypeSelctionLb.getSelectedIndex() == 0 ? "byState" :"byCity";
	}

		public boolean containsCanvas() {
			if (mapCanvas.getWidget() == null) return false;
			else return true;
		}
	
}
