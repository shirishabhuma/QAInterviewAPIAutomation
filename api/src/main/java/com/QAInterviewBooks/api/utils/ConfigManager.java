package com.QAInterviewBooks.api.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
	
	private static ConfigManager manager;
	private static final Properties prop = new Properties();
	
	private ConfigManager() throws IOException {
		
		FileInputStream inputstream = new FileInputStream(System.getProperty("user.dir")+ "/resources/config.properties");
		prop.load(inputstream);
	}
	
    public static ConfigManager getInstance() {
    	if (manager ==null)
    	synchronized (ConfigManager.class) {
    		try {
				manager = new ConfigManager();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    		
		return manager;
		
	}
    
    public String getString(String key) {
		
    	return System.getProperty(key, prop.getProperty(key));
    	
    }
	

}
