package com.gmail.vivek.client.callbacks;

import java.util.Vector;

import com.gmail.vivek.client.Mediator;
import com.gmail.vivek.shared.OutputData;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class ProcessDataCallback implements AsyncCallback<OutputData> {

	public void onFailure(Throwable caught) {
		// TODO Auto-generated method stub
		Mediator.getInstance().showMessage("Error reading contents from Server");

	}

	public void onSuccess(OutputData result) {
		Mediator.getInstance().updateOutputPanel(result);
		

	}

}
