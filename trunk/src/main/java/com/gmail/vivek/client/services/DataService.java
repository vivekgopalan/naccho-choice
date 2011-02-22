package com.gmail.vivek.client.services;

import java.util.HashMap;

import com.gmail.vivek.shared.InputOptions;
import com.gmail.vivek.shared.OutputData;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("dataService")
public interface DataService extends RemoteService{

	public OutputData processData(InputOptions input);
	public HashMap<String, String[]> getInputData();

	public static class App {
		private static DataServiceAsync app = null;
		
		public static synchronized DataServiceAsync getInstance() {
			if (app == null) {
				app = (DataServiceAsync) GWT.create(DataService.class);
			}
			return app;
		}
	}

	

}
