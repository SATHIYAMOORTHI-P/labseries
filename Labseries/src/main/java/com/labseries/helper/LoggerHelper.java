package com.labseries.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.labsries.configreader.ConfigReader;

public class LoggerHelper {
public static boolean root=false;
	
	@SuppressWarnings("rawtypes")
	public static Logger getLogger(Class clazz) {
		if(root) {
			return Logger.getLogger(clazz);
		}
		else {
			PropertyConfigurator.configure(ConfigReader.log4jPropertyFilePath);
		root=true;
		
		}
		return Logger.getLogger(clazz);
	}
	
	LoggerHelper log=new LoggerHelper();
	
	
	
	
	
	
	
}
