package com.gmail.vivek.client;

import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.drop.DropController;
import com.gmail.vivek.client.panels.LoadingPanel;
import com.gmail.vivek.client.panels.OutputPanel;
import com.gmail.vivek.shared.OutputData;

public class Mediator {
	 private static Mediator instance;
	    static public Mediator getInstance()  {
	        if (instance == null) {
	            instance = new Mediator();
	        }
	        return instance;
	    }
		private OutputPanel outputPanel;
		private LoadingPanel loadingPanel;
		public void registerOuputPanel(OutputPanel outputPanel) {
			// TODO Auto-generated method stub
			this.outputPanel = outputPanel;
		}
		public void updateOutputPanel(OutputData result) {
			outputPanel.update(result);
		}
		
		public void registerCharacteristicDropController(PickupDragController dc) {
			outputPanel.registerCharacteristicDropController(dc);
		}
		public void registerIndicatorDropController(PickupDragController dc) {
			outputPanel.registerIndicatorDropController(dc);
		}
		public void showMessage(String string) {
			loadingPanel.setInfoContent(string);
			
		}
		public void registerLoadingPanel(LoadingPanel loadingPanel) {
			this.loadingPanel = loadingPanel;
			
		}

	
}
