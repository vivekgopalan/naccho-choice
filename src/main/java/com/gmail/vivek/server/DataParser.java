package com.gmail.vivek.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;



public class DataParser {

	Vector<String []>dataRow=new Vector<String[]>();
	public DataParser(String urlString){
		//String filePath = "profile2008_subset.txt";
		if (dataRow.size() <= 0 ) {
		
		  try {
	            URL url = new URL(urlString);
	            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	            String line;
	            int count = 0;
	            while ((line = reader.readLine()) != null) {
	            	String [] data=line.split("\\t");
	            	dataRow.add(data);
	            	if (count++ == 100) break;
	            }
	            reader.close();

	        } catch (MalformedURLException e) {
	            // ...
	        	e.printStackTrace();
	        } catch (IOException e) {
	            // ...
	        }
		
		}
		
	}
	
	public void doTest(){
		String [] first=this.dataRow.get(0);
		int rowNum=first.length;
		for(int i=1; i< this.dataRow.size(); i++){
			if(rowNum!=this.dataRow.get(i).length){
				System.out.println("row "+i+"  "+this.dataRow.get(i).length+"  "+rowNum);
			}
		}
	}
	
	public Vector<String[]> searchColumn(String[] keys){
		Vector<String[]> result =new Vector<String[]>();
		String colName[]=this.dataRow.get(0);
		
		int usePos=-1;
		int[] keyIdx = new int[keys.length];
		 
		for(int i=0; i<colName.length; i++){
			String[] out = new String[keys.length];
			for(int j=0; i < keys.length; i++){
			 if(colName[i].toLowerCase().equals(keys[j].toLowerCase())) {
				usePos=i;
				keyIdx[j] = i;
				break;
			}
		}
		
			for(i=1; i< this.dataRow.size(); i++){
				String[] tmp = new String[keys.length];
				
			for (int j = 0; j < keyIdx.length; j++) {
					tmp[j]=this.dataRow.get(i)[j];
				}	
				result.add(tmp);

			}
			
		}
		return result;
	}
	
	
	public static void main(String [] argv){
		DataParser dp=new DataParser("src/main/webapp/profile2008_subset.txt");
		dp.doTest();
		Vector<String[]> data =dp.searchColumn(new String[]{"q15"});
		//for(String k: data){
		//	System.out.println("+"+k+"+");
		//}
		
	}

	
}
