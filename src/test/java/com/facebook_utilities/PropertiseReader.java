package com.facebook_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiseReader {
	
	Properties properties;//instance variable
	
	
  // this is constructor
	public PropertiseReader() {
		properties = new Properties();
		String filePath = "src/test/resources/Test.properties";
		FileInputStream fis;

		try {
			fis = new FileInputStream(filePath);
			properties.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String readBrowser() {
		return properties.getProperty("browser");
	}
	public String readUrl() {
		return properties.getProperty("url");
	}
	
	
	public String readUserName() {
		return properties.getProperty("userName");
	}
	public String readPassword() {
		return properties.getProperty("password");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("propertise");
		PropertiseReader pr = new PropertiseReader();
		System.out.println(pr.readPassword());
	}

}
