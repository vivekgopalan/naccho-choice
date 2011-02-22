package com.gmail.vivek.client.callbacks;

import java.util.HashMap;

import com.gmail.vivek.client.panels.InputPanel;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class InputDataCallBack implements
		AsyncCallback<HashMap<String, String[]>> {

	private InputPanel panel;

	public InputDataCallBack(InputPanel inputPanel) {
			this.panel = inputPanel;
}

	public void onFailure(Throwable caught) {
		// TODO Auto-generated method stub

	}

	public void onSuccess(HashMap<String, String[]> result) {
panel.update(result);		
	}

}
