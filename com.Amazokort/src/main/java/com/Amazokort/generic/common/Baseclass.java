package com.Amazokort.generic.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Baseclass extends ObjectUtility {
	public WebDriver driver = null;
	public static WebDriver driver_static = null;

	@DataProvider(name = "Register")
	public Object[][] Registerdata() {
		Object[][] data = new Object[3][3];
		data[0][0] = "dharani";
		data[0][1] = "dharani@gmail.com";
		data[0][2] = "testing";

		data[1][0] = "dhana";
		data[1][1] = "dhana@gmail.com";
		data[1][2] = "testing";

		data[2][0] = "lakshmi";
		data[2][1] = "lakshmi@gmail.com";
		data[2][2] = "devops";

		return data;
	}

	// login and logout
	@BeforeMethod
	public void login() {
		Reporter.log("login successfully", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("logout successfully", true);
	}

	@Parameters("browser")
	@BeforeClass
	public void browsersetup(String browser) {

		// if user browsername="Chrome";
		if (browser.equals("chrome")) {
			// launch the browser-firefox
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/java/chromedriver.exe");
			driver = new ChromeDriver();
		}

		// if user browsername="firefox";
		else if (browser.equals("firefox")) {
			// launch the browser-chrome
			driver = new FirefoxDriver();
		}
		// if user browsername="edge";
		else if (browser.equals("edge")) {
			// launch the browser-firefox
			driver = new EdgeDriver();
		} else {
			System.out.println(" U have Enter the invalid browsername and default browser");
			// driver=new ChromeDriver();

		}
		// create object for all
		objectCreation();

		// fetch data
		//String URL = propertyobj.readdata("url");

		// step2:Navigate to the Application via URL
		driver.get("file:/C:/Users/pavan/eclipse-workspace/Dharani/com.Amazokort/src/test/resources/web/webpage.html");
		Reporter.log("BrowserSetup Sucessful", true);

	}

	@AfterClass
	public void closebrowser() {
		// close the browser
		driver.close();
		Reporter.log("closebrowser successfully", true);
	}

	@BeforeTest
	public void precondition() {

		Reporter.log("precondition successfully", true);
	}

	@AfterTest
	public void postcondition() {

		Reporter.log("postcondition successfully", true);
	}

	@BeforeSuite
	public void getsuiteconnecction() {

		Reporter.log("getsuite connection successfully", true);
	}

	@AfterSuite
	public void terminatesuiteconnection() {

		Reporter.log("terminate suite connection successfully", true);
	}
}
