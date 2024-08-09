package com.Amazokort.generic.webdriverutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverutility {
public void WaitForPageToLoad(RemoteWebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
public void WaitForElementepresent(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(element));
}

//Switch to frame
public void SwitchToFrame(WebDriver driver,int index)
{
driver.switchTo().frame(index);	
}
public void SwitchToFrame(WebDriver driver,String nameID)
{
driver.switchTo().frame(nameID);	
}
public void SwitchToFrame(WebDriver driver,WebElement element)
{
driver.switchTo().frame(element);	
}
//switch to alert handling
public void SwitchToAlertAndAccept(WebDriver driver)
{
driver.switchTo().alert().accept();	
}
public void SwitchToAlertAndCancel(WebDriver driver)
{
driver.switchTo().alert().dismiss();	
}
//select class handle the dropdowns
public void select(WebElement element,String text)
{
Select sel=new Select(element);
sel.selectByVisibleText(text);
}

public void select(WebElement element,int index)
{
Select sel=new Select(element);
sel.selectByIndex(index);
}
//Actions class to handle the mouse &keyboard actions
public void mousemoveonElement(WebDriver driver, WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}	
public void doubleclick(WebDriver driver, WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}	
public void cllickOnElement()
{
	
}
public void PassDateonElement()
{
	
}
public void clearDataonElement()
{
	
}
public void validateOnElementDisplayed()
{
	
}
public void validateOnElementEnable()
{
	
}
public void validateOnElementSelected()
{
	
}
public void  selectOptionDropdown(int index) 
{

} 
public void  selectOptionDropdown(String visibletext)
{

}
public void  selectOptionDropdown_value(String visibletext)
{

} 
public void switchControlToAlert()
{

}
public void switchControlToFrame()
{
	
}
}

