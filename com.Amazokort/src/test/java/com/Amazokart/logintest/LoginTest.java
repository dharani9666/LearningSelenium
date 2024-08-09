package com.Amazokart.logintest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazokort.generic.common.Baseclass;

public class LoginTest extends Baseclass {

	@Test(dataProvider = "Register")

	public void login_validData(String un,String email,String dept)
	{
		System.out.println(un);
		System.out.println(email);
		System.out.println(dept);
		Reporter.log("login_validData for login  Test", true);

	}

	@Test
	public void login_invalidData() {
		Reporter.log("login_invalidData for login Test", true);
	}
}
