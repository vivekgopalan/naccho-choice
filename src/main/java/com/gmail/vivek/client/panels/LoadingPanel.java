package com.gmail.vivek.client.panels;


import com.gmail.vivek.client.Mediator;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;

public class LoadingPanel extends Composite {

	private Image ajaxLoaderImg= new Image("resources/images/ajax-loader.gif");
	//private HTML loadingHTML = new HTML("Loading..");
	private HorizontalPanel mainPanel = new HorizontalPanel();
	private HTML infoPanel;
	private Timer togglebuttonTimer;
	private HorizontalPanel hp;
	private PopupPanel popupPanel;

	public LoadingPanel(Mediator med) {
		med.registerLoadingPanel(this);
		infoPanel = new HTML("_");
		hp = new HorizontalPanel();
		hp.add(ajaxLoaderImg);
		//hp.add(loadingHTML);
		mainPanel.add(hp);
		mainPanel.add(infoPanel);
		//mainPanel.setCellHorizontalAlignment(hp,HorizontalPanel.ALIGN_RIGHT );
		mainPanel.setCellWidth(infoPanel, "100%");
		
		togglebuttonTimer = new Timer() {
			public void run() {
				infoPanel.setHTML("_");
			}
		};
		initWidget(mainPanel);
		getElement().getStyle().setProperty("background", "#EEEEEE");
		setWidth("100%");
		setTitle("Status panel");
		showAjaxLoad(false);
	}
	
	public void setPopupPanel(PopupPanel p) {
		popupPanel = p;
	}
	public void showAjaxLoad(boolean b) {
		hp.setVisible(b);
		if (popupPanel !=null) {
			if (b) popupPanel.show();
			else popupPanel.hide();
		}
	}
	
	public void setInfoContent(String infoContent) {
		infoPanel.setHTML("<I>" +infoContent + "</I>");
		togglebuttonTimer.cancel();
		togglebuttonTimer.schedule(3000);
	}

	public void setInfoContent(String string, boolean b) {
		showAjaxLoad(b);
		setInfoContent(string);
	}

}
