package com.Amazokort.generic.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	public Registerpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "name" )
	private WebElement name;
	public WebElement getName() {
		return name;
	}

	@FindBy(id = "email" )
	private WebElement email;
	public WebElement getemail() {
		return email;
	}

	@FindBy(id = "name" )
	private WebElement name1;
	public WebElement getName1() {
		return name;
	}

}
