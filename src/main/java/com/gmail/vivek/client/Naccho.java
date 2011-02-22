package com.gmail.vivek.client;

import com.gmail.vivek.client.callbacks.InputDataCallBack;
import com.gmail.vivek.client.panels.InputPanel;
import com.gmail.vivek.client.panels.LoadingPanel;
import com.gmail.vivek.client.panels.OutputPanel;
import com.gmail.vivek.client.services.DataService;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Naccho implements EntryPoint {
 
  /**
   * This is the entry point method.
   */
	

  public void onModuleLoad() {
 	Mediator mediator;  
	
	OutputPanel outputPanel = new OutputPanel(Mediator.getInstance());
	InputPanel inputPanel  = new InputPanel();
	
	HorizontalPanel mainContentPanel = new HorizontalPanel();
	
	mainContentPanel.add(inputPanel);
	VerticalPanel vp = new VerticalPanel();
	vp.setWidth("735px");
	vp.add(new LoadingPanel(Mediator.getInstance()));
	vp.add(outputPanel);
	mainContentPanel.add(vp);
	
    RootPanel.get("main_content").add(mainContentPanel );
    DataService.App.getInstance().getInputData(new InputDataCallBack(inputPanel)); 
  }
  
}
