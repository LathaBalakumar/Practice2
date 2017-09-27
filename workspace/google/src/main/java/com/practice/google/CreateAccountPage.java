package com.practice.google;

import org.openqa.selenium.WebDriver;

public class CreateAccountPage 
{
	WebDriver driver;


public String getUrl()
{
	System.out.println("This is first Change");
	return driver.getCurrentUrl();
	
}



	public  CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
	
	
	
}

