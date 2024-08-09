package com.Amazokort.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kidsproducttest1 {
	

	@Test(priority = 3,dependsOnMethods="addproduct",enabled=false,groups="smoke")
	public void deleteproduct()
	{
		Reporter.log("deleteproduct--kids product successfully",true);
	}

	@Test(priority = 2,dependsOnMethods="addproduct",groups="functionality")
	public void updateproduct()
	{
		Reporter.log("updateproduct--kids product successfully",true);
		
	}
	@Test(priority = 1,invocationCount = 2,groups="integration")
	public void addproduct()
	{
		Reporter.log("addproduct--kids product successfully",true);
	}
	}

