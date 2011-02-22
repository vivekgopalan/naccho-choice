package com.gmail.vivek.server;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RFactor;
import org.rosuda.JRI.RList;
import org.rosuda.JRI.RVector;
import org.rosuda.JRI.Rengine;

import com.gmail.vivek.client.services.DataService;
import com.gmail.vivek.shared.ColumnData;
import com.gmail.vivek.shared.ColumnData.ColumnDataType;
import com.gmail.vivek.shared.InputOptions;
import com.gmail.vivek.shared.OutputData;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class DataServiceImpl extends RemoteServiceServlet implements DataService {
   private static Logger logger = Logger.getLogger(DataServiceImpl.class.getName());
   
   DecimalFormat df = new DecimalFormat( ".000");
	private DataParser dp;
	private Rengine re;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		logger.setLevel(Level.ALL);
		super.init();
		//System.setProperty("java.library.path","/Library/Frameworks/R.framework/Versions/2.12/Resources/library/rJava/jri");
		 startREngine();
	}

	@Override
	public void destroy() {
		if(re !=null) {
			re.end();
		}
		super.destroy();
	}
	public OutputData processData(InputOptions input) {
		OutputData out = new OutputData();
		HttpServletRequest request = getThreadLocalRequest();
		String s = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
		String fileName =  s + "/data/profile2008_subset.txt";
		if (dp == null)
		dp = new DataParser(fileName);
		
		String colName;
		Vector<String> characteristics = input.getCharacteristics();
		Vector<String> indicators = input.getIndicators();
		
		/*BigDecimal hi ;
		 try {
		//	hi = new HealthIndicator(getServletContext().getRealPath("/") + "data/local.txt").getDatafor("01001", 13, 2004, 2008);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		String in = new String("");
		
		String ch = new String("");
		
		for (Iterator it = characteristics.iterator(); it.hasNext();) {
			String x = (String) it.next();
			ch +=x + ",";
		}
		ch = ch.replaceAll(",*$", "");
		
		for (Iterator it = indicators.iterator(); it.hasNext();) {
			String x = (String) it.next();
			in +=x + ",";
		}
		in = in.replaceAll(",*$", "");
		
		String aggregateStr =	"aggregate(subset(x,select=c(" + in +")),subset(x,select=c(" + ch + ")),mean,na.rm = TRUE)";
		
		if (input.isMapType() && input.getMapType().equals("byCity"))
			aggregateStr =	"merge(geo_data,"+ aggregateStr +",all.y=TRUE)";
			
		String aggregrateListStr = "as.list("+ aggregateStr +")";
		logger.fine("R script string: " + aggregrateListStr);
		 RList v = re.eval(aggregrateListStr).asList();
		 
		 String[] keys = v.keys();
		 for (int i = 0; i < keys.length; i++) {
			 ColumnData cd = new ColumnData();
			 cd.setName(keys[i]);
			REXP col = v.at(i);
			if (col.getType() ==REXP.XT_FACTOR) {
				cd.setType(ColumnDataType.STRING);
				RFactor f = col.asFactor();
				for (int j = 0; j < f.size(); j++) cd.add(f.at(j));
			}else if (col.getType() ==REXP.XT_ARRAY_INT) {
				int[] vect = col.asIntArray();
				cd.setType(ColumnDataType.INTEGER);
				for (int j = 0; j < vect.length; j++) cd.add(vect[j] + "");
			}else if (col.getType() ==REXP.XT_ARRAY_DOUBLE) {
				double[] vect = col.asDoubleArray();
				cd.setType(ColumnDataType.DOUBLE);
				for (int j = 0; j < vect.length; j++) cd.add(df.format(vect[j]) + "");
			}else if (col.getType() ==REXP.XT_ARRAY_STR) {
				String[] vect = col.asStringArray();
				cd.setType(ColumnDataType.STRING);
				for (int j = 0; j < vect.length; j++) cd.add(vect[j]);
			}else if (col.getType() ==REXP.XT_ARRAY_BOOL) {
				RVector vect = col.asVector();
				cd.setType(ColumnDataType.BOOLEAN);
				for (int j = 0; j < vect.size(); j++) cd.add(vect.at(j) + "");
			}else {
				logger.severe("ERROR parsing column type:" + col.getType());	
			}
			out.add(cd);
		}
		return out;
	}

	public HashMap<String, String[]> getInputData() {
		HashMap<String, String[]> out = new HashMap<String, String[]>();
		out.put("characteristics", re.eval("characteristics").asStringArray());
		out.put("indicators", re.eval("indicators").asStringArray());
		return out;
	}
	
	private void startREngine() {
		if (re !=null)  {
			logger.finest("R already started");
			return;
		}
		if (!Rengine.versionCheck()) {
		    logger.severe("** Version mismatch - Java files don't match library version.");
		    System.exit(1);
		}
	        logger.fine("Creating Rengine (with arguments)");
			re=new Rengine(new String[]{"--save"}, false, new TextConsole());
	        logger.fine("Rengine created, waiting for R");
			// the engine creates R is a new thread, so we should wait until it's ready
	        if (!re.waitForR()) {
	        	logger.severe("Cannot load R");
	            return;
	        }
	        //String dataFile="/Users/vivek/Workspaces/Eclipse/Naccho/src/main/webapp/data/profile2008subset_fips_final-4.csv";
	        //String dataFile   = getServletContext().getRealPath("/") + "/data/profile2008subset_fips_final-4.csv";
	        //String placesFile     = getServletContext().getRealPath("/") + "/data/places2k_utf8.txt";
	        //String scriptFile = getServletContext().getRealPath("/") + "/scripts/process_data.R";
	        //System.out.println(re.eval("data_file=\""+ dataFile + "\";"));
	        //System.out.println(re.eval("place_file=\""+ placesFile + "\";"));
	        //System.out.println(re.eval("source(\""+ scriptFile + "\");"));
	        
	        String rDataFile = getServletContext().getRealPath("/") + "data/processed_data.RData";
	        logger.fine(re.eval("load(\""+ rDataFile + "\");").toString());
	       
	}

}
