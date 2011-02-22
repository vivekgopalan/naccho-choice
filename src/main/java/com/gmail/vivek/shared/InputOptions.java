package com.gmail.vivek.shared;

import java.util.Vector;

import com.google.gwt.user.client.rpc.IsSerializable;

public class InputOptions implements IsSerializable{
	private Vector<String> indicators;
	private Vector<String> characteristicNames;
	private String mapType;
	
	public InputOptions() {
	
	}
	public void setIndicators(Vector<String> financialInput) {
		this.indicators = financialInput;
	}
	public Vector<String> getIndicators() {
		return indicators;
	}
	public void setCharacteristics(Vector<String> name) {
		// TODO Auto-generated method stub
		characteristicNames = name;
	}
	public Vector<String> getCharacteristics() {
		return characteristicNames;
	}
	public boolean isEmpty() {
		if(getCharacteristics().size() <=0 || getIndicators().size() <=0)
		return true;
		else 
			return false;
	}
	public void setMapType(String mapType) {
			this.mapType = mapType;		
	}
	public String getMapType() {
		return mapType;
	}
	public boolean isMapType() {
		if (mapType == null) return false;
		else return true;
		
}
	
	
}
