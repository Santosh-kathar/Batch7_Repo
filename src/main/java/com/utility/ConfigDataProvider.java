package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		String path="C:\\Users\\santo\\eclipse-workspace\\Framework_Batch7\\Config\\Config.Properties";
		FileInputStream fis=new FileInputStream(path);
	    pro=new Properties();
		pro.load(fis);
	}

	public String getStageUrl() {
		return pro.getProperty("StageUrl");
		
	}
	public String getLiveUrl() {
		return pro.getProperty("LiveUrl");
		
	}
}
