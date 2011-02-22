package com.gmail.vivek.client.panels;

import com.gmail.vivek.client.Mediator;
import com.gmail.vivek.client.interfaces.UpdateableContents;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class TablePanel extends Composite implements UpdateableContents {

	private OutputPanel outputPanel;
    private VerticalPanel mainPanel = new VerticalPanel();
	private SimplePanel canvasPanel;
    
	public TablePanel(OutputPanel outputPanel) {
		this.outputPanel = outputPanel;
		canvasPanel = new SimplePanel();
		mainPanel.add(canvasPanel);
		initWidget(mainPanel);
	}
		

	public void updateContents() {
		outputPanel.createAndShowTable();
	}


	public void updateCanvas(Widget viewWidget) {
		canvasPanel.setWidget(viewWidget);
	}


	public boolean containsCanvas() {
		if (canvasPanel.getWidget() == null) return false;
		else return true;
	}

}
