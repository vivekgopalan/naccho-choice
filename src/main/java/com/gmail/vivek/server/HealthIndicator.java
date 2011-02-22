package com.gmail.vivek.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.Indicator;
import org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.Locale;
import org.tempuri.ISOAP;
import org.tempuri.SOAPLocator;
import org.tempuri.SOAPStub;

public class HealthIndicator {

	String endPoint="http://services.healthindicators.gov/v1/SOAP.svc?wsdl";
	String localFile;
	ISOAP myiso=null;
	Hashtable<String, String> fipID=new Hashtable<String, String>();
	public HealthIndicator(String file) throws Exception{
		localFile = file;
		File inputFile=new File(this.localFile);
		BufferedReader br=new BufferedReader(new FileReader(inputFile));
		while(br.ready()){
			String temp=br.readLine();
			if(temp.length()>0){
				String l[]=temp.split("\\t");
				if(l.length==2)	this.fipID.put(l[1], l[0]);
			}
		}
		
		br.close();
		
		Service  service=new Service();
	
	//	SOAPStub ss=new SOAPStub();
		//Integer result=ss.getAdjustmentsCount();
		
		SOAPLocator sl=new SOAPLocator();
		Integer r=sl.getSOAP().getLocalesCount();
		myiso=sl.getSOAP();
//		for(int i=0; i<r.intValue(); i++){
//			Locale l=sl.getSOAP().getLocaleByID(i);
//			if(l!=null)			{
//				sl.gets
//				System.out.print(sl.getSOAP().getLocaleByID(i).getFullName()+"  ");
//				System.out.println(l.getCountyFipsCode());
//			}
//		}
//	    Integer result=	sl.getSOAP().getAdjustmentsCount();
//		sl.getPort(serviceEndpointInterface)
		
	//	System.out.println("result is "+result);
		
	}
	
	
	
	public BigDecimal getDatafor(String fipID, int indicator, int startYear, int endYear) throws Exception{
		
		String localID=this.fipID.get(fipID);
		BigDecimal total=new BigDecimal(0);
		if(localID!=null){
			int pageNumber=this.myiso.getIndicatorsByIndicatorDescriptionIDPageCount(indicator);
		//	System.out.println("page is "+pageNumber);
			int target=pageNumber>5?2:pageNumber;
			for(int i=0; i<pageNumber; i++){
				Indicator[] list= this.myiso.getIndicatorsByIndicatorDescriptionID(indicator, i);
				for(Indicator s : list){
			//		System.out.println(s.getLocaleID()+"  "+s.getTimeframeID()+"  "+s.getFloatValue());
					if(s.getLocaleID().intValue()==Integer.parseInt(localID)){
						System.out.println(s.getLocaleID()+"  "+s.getTimeframeID()+"  "+s.getFloatValue());
	//					if(s.getTimeframeID()>=startYear && s.getTimeframeID()<=endYear){
							if(s.getFloatValue()!=null)		total.add(s.getFloatValue());
		//				}
				//	System.out.println(s.getTimeframeID()+"  "+s.getFormattedValue()+"  "+s.getIntegralValue());
//					return s.getFormattedValue();
					}
				//System.out.println(s.getLocaleID()+"  "+s.getFormattedValue());
				}
			}
			
		}
		
		return total;
	}
	
	
	private Integer getLocalIDFromFip(String fipID) throws Exception{
		
		return null;
		
	}
	
	public void getAllLocalToFip() throws Exception {
		File tmpFile=new File("/Users/guoyo/Documents/workspace/Test/local2.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(tmpFile));
		Integer r=this.myiso.getLocalesCount();
		for(int i=0; i<r.intValue(); i++){
			Locale l=this.myiso.getLocaleByID(i);
			if(l!=null && l.getCountyFipsCode()!=null){
				bw.write(i+"\t"+l.getCountyFipsCode()+"\n");
				System.out.println(i+"\t"+l.getCountyFipsCode());
			}
		}
		bw.close();
	}
	
	public static void main(String [] args){
		try{
		//	new HealthIndicator().getAllLocalToFip();
		 System.out.println(new HealthIndicator("local.txt").getDatafor("01001", 13, 2004, 2008).toString());
		}catch(Exception e){
			e.printStackTrace(System.out);
		}
	}
	
}
