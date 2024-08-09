package com.Amazokort.generic.propertyutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Amazokort.generic.common.FrameWorkConstant;

public class Readpropertyfile implements FrameWorkConstant {
	FileInputStream fis;
	FileOutputStream fos;
	Properties p;

	public String readdata(String key) {
		// convert the physical file into java understandable
		try {
			fis = new FileInputStream(Propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// creating instance for properties class
			p = new Properties();

			// load the all common data

			try {
				p.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		// fetch the data
		String data = p.getProperty(key);
		System.out.println(data);
		return data;
	}

	public void writeData(String key, String value) {

		// enter the data
		p.put(key, value);

		// create instance for file output stream
		try {
			fos = new FileOutputStream(Propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// store the data
		try {
			p.store(fos, "updated the new key-value successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void displaydata(String key) {
		// convert the physical file into java understandable
		try {
			fis = new FileInputStream(Propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

		// creating instance for properties class
		p = new Properties();

		// load the all common data
		try {
			p.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// fetch the data
		String data = p.getProperty(key);

		// print on console
		System.out.println(data);
	}
}
