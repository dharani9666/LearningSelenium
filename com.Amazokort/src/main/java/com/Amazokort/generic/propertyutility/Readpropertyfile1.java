
package com.Amazokort.generic.propertyutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Amazokort.generic.common.FrameWorkConstant;

public class Readpropertyfile1 implements FrameWorkConstant{
	FileInputStream fis;
	FileOutputStream fos;
	Properties p;

	public String readData(String key) throws IOException {
		// Convert the Physical file into Java Understandable
		fis = new FileInputStream(Propertypath);

		// creating Instance for Properties class
		p = new Properties();

		// load the all Common Data
		p.load(fis);

		// fetch the data
		String data = p.getProperty(key);
		return data;
	}

	public void writeData(String key, String value) throws IOException {
		// enter the data
		p.put(key, value);

		// create instance for FILE output Stream
		fos = new FileOutputStream(Propertypath);

		// store the Data
		p.store(fos, "Updated the New Key-value Sucessfully");
	}

	public void displaydata(String key) {
		// Convert the Physical file into Java Understandable
		try {
			fis = new FileInputStream(Propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// creating Instance for Properties class
		p = new Properties();

		// load the all Common Data
		try {
			p.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// fetch the data
		String data = p.getProperty(key);
		
		//Print on Console
		System.out.println(data);

	}
}