package com.MGS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.MGS.utilities.AbstractComponent;

public class LandingPage extends AbstractComponent{
	
	   WebDriver driver;
	  public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goTo(String url) {
		driver.get(url);
	}

}
