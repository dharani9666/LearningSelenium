package com.Amazokort.generic.common;

import com.Amazokort.generic.excelutility.ReadExcelFile;
import com.Amazokort.generic.javautility.Javautility;
import com.Amazokort.generic.propertyutility.Readpropertyfile;
import com.Amazokort.generic.webdriverutility.Webdriverutility;

public  class ObjectUtility  implements FrameWorkConstant{
  public ReadExcelFile excelobj;
  public Javautility javaobj;
  public Readpropertyfile propertyobj;
  public Webdriverutility webdriverobj;
	
	public  void objectCreation()
	{
		excelobj=new ReadExcelFile();
		javaobj=new Javautility();
	    propertyobj=new Readpropertyfile();
		webdriverobj=new Webdriverutility();
	}
}
