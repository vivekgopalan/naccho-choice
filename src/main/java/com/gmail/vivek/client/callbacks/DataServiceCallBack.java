package com.gmail.vivek.client.callbacks;

import com.gmail.vivek.client.Mediator;
import com.gmail.vivek.shared.OutputData;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class DataServiceCallBack implements AsyncCallback<OutputData> {

	public void onFailure(Throwable caught) {
		// TODO Auto-generated method stub

	}

	public void onSuccess(OutputData result) {
			Mediator.getInstance().updateOutputPanel(result);
	}

}
