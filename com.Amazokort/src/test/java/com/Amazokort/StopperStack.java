package com.Amazokort;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StopperStack {
	public void main(String[] args) throws Throwable{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/25");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("//button[contains(@id,'compare')]")).click();
		
		//fetching the super id address
		//String parentId =driver.getWindowHandle();
		
		//fetching all sub id address
		Set<String> allwin=driver.getWindowHandles();
        for(String win:allwin)
        {
        	driver.switchTo().window(win);
            Thread.sleep(2000);
            String curl=driver.getCurrentUrl();
            System.out.println(curl);
            
            if(curl.equals("https://www.shopperstack.com/products_page/25"))
            {
            	
            }
			
            else {
            	driver.close();
            	
            }
        }
		
	}
}
