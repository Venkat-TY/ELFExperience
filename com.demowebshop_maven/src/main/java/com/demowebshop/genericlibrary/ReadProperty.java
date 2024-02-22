package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws Throwable {
		
		File file=new File("./src/test/resources/propertyFile/ConfigureProperties.java");
		FileInputStream fis=new FileInputStream(file);
		Properties pro=new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("browser"));

	}

}
