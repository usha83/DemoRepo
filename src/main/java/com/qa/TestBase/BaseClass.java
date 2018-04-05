package com.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	public Properties pr;
	String path;
    FileInputStream fis;
	
	public BaseClass() 
	{
	   pr=new Properties();
	   path=System.getProperty("user.dir")+"/src/main/java/com/qa/conig/config.properties";
	try {
		fis = new FileInputStream(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		pr.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
	}

}
