package com.gmail.vivek.client.services;

import java.util.HashMap;

import com.gmail.vivek.shared.InputOptions;
import com.gmail.vivek.shared.OutputData;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;

public interface DataServiceAsync  {

	public void processData(InputOptions input, AsyncCallback<OutputData> callback);
	public void getInputData(AsyncCallback<HashMap<String, String[]>> callback);

	
}
