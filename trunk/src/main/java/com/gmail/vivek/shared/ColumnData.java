package com.gmail.vivek.shared;

import java.util.Vector;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ColumnData extends Vector<String> implements IsSerializable {

	public static enum ColumnDataType {
	    BOOLEAN, STRING, INTEGER, DOUBLE
	}
	
private String name = new String();
private ColumnDataType type;

public ColumnData(String name, ColumnDataType string) {
	this.name = name;
	this.type = string;
}

public ColumnData() {
	// TODO Auto-generated constructor stub
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setType(ColumnDataType type) {
	this.type = type;
}

public ColumnDataType getType() {
	return type;
}

}
