package com.Amazokort.registertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.Amazokort.generic.common.Baseclass;

public class RegisterTest extends Baseclass {

	@Test(enabled = false)
	public void createUser_validData() {

//		Assert.fail();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Verify Page Using Assert
		String exp_title = "LEarning WEB TECHNOLOGY FORMS";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		Assert.assertEquals(act_title, exp_title);

		// Create Object for RegisterPage
		// Registerpage regpage = new Registerpage(driver);

		// Step1:Clear the Name in The Name TextField
		// regpage.getName().clear();

		WebElement ele = driver.findElement(By.id("name"));
		ele.clear();

		// Step 2: write the Name in the Name Text Field
		ele.sendKeys(excelobj.readdata("student", 1, 1));

		// Step3:Display the Email
		System.out.println(excelobj.readdata("student", 1, 2));

		// Step4:Write the Data
		excelobj.writedata("student", 2, 1, "dharani");

		// Execution Completed Message
		Reporter.log("createUser_validData for Register Test", true);
	}

	@Test(dataProvider = "Register")
	public void createUser_invalidData(String name, String email, String password) {

		// step1:identify name textfield
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);

		// step1:identify email textfield
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);

		// step1:identify password textfield
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);

		System.out.println("Name:" + name);
		System.out.println("email:" + email);
		System.out.println("password:" + password);
		Reporter.log("createUser_InvalidData for Register Test", true);

	}

}