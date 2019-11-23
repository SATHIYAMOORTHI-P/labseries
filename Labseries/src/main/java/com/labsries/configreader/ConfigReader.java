package com.labsries.configreader;

public interface ConfigReader {
	
	public static final String browser="Browser";
	public static final String website="Website";
	public static final String chromeDriver_key="webdriver.chrome.driver";
	public static final String chromDriver_value="";
	public static final String log4jPropertyFilePath="D:\\LabSeries\\Labseries\\src\\main\\resources\\configfiles\\log4j.properties";
	public static final String configProperyFilePath="D:\\LabSeries\\Labseries\\src\\main\\resources\\configfiles\\config.properties";
	
	
	public String getBrowser();
	
	public String getWebsite();
	
	
	
	
	

}
