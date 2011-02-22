package com.gmail.vivek.shared;

import java.util.Vector;

import com.google.gwt.user.client.rpc.IsSerializable;

public class OutputData extends Vector<ColumnData> implements IsSerializable{
	
	Vector<ColumnData> colNames;
	
	public OutputData() {
		colNames = new Vector<ColumnData>();
	}
	
}
