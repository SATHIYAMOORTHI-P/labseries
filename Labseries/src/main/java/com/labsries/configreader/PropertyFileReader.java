package com.labsries.configreader;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader implements ConfigReader {

	private Properties pfr;
	
	public PropertyFileReader() {
pfr=new Properties();

try {
	pfr.load(new FileInputStream(configProperyFilePath));
}
catch(Exception e) {
	e.printStackTrace();
}
	
	}

	public String getBrowser() {
		return pfr.getProperty(browser);
	}

	public String getWebsite() {
		return pfr.getProperty(website);
	}
	
	
	
	
	
	
	
	
	
	
	

}
