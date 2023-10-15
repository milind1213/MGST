package com.MGS.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	
	WebDriver driver;
	  public AbstractComponent(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);

  }
	  
	  public static WebElement waitForElementToBeClickable(WebDriver driver, By locator, int seconds) {
	        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(seconds));
	        return wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }
	 
	  public void waitForElementToAppear(WebElement ele, int seconds) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		    wait.until(ExpectedConditions.visibilityOf(ele));
		}

	  public static void selectDropdownOptionByText(WebDriver driver, By dropdownLocator, String optionText) {
	        WebElement dropdown = driver.findElement(dropdownLocator);
	        Select select = new Select(dropdown);
	        select.selectByVisibleText(optionText);
	    }

   protected void waitForElementDisplay(WebElement ele, int seconds) {
       try {
           new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOf(ele));
       } catch (Exception e) {
           System.err.println("Waited for element [" + ele + "] for " + seconds + " seconds");
       }
   }

   public void waitFor(int i) {
       try {
           Thread.sleep(1000 * i);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
	  
   public void click(By locators)
   {
       try
       {
           waitFor(2);
           driver.findElement(locators).click();
           waitFor(1);
       } catch (Exception e)
       {
           e.printStackTrace();
           Assert.fail("Failed to click on element [" + locators + "] ");
       }
   }
   
   protected void waitForElementDisplay(By locator, int timeoutSeconds)
   {
       try
       {
           new WebDriverWait(driver,Duration.ofSeconds(timeoutSeconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
       } catch (Exception e)
       {
           System.err.println("Waited for element [" + locator + "] for " + timeoutSeconds + " seconds");
       }
   }
   
   

   
   public void scrollUpto(By elementLocator) {
	    try {
	        WebElement element = driver.findElement(elementLocator);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", element);
	    } catch (NoSuchElementException e) {
	        e.printStackTrace();
	        Assert.fail("Element not found: " + elementLocator);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	        Assert.fail("Failed to scroll to element: " + elementLocator);
	    }
	}

   
   protected void scrollClick(By locator)
   {
       WebElement element = driver.findElement(locator);
       JavascriptExecutor js = (JavascriptExecutor) driver;

       js.executeScript("arguments[0].scrollIntoView(true);", element);
       waitFor(1);
       js.executeScript("arguments[0].click();", element);
   }
   
   protected void waitForElementClickable(By locator, int timeoutSeconds)
   {
       try
       {
           new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds)).until(ExpectedConditions.elementToBeClickable(locator));
       } catch (Exception e)
       {
           System.err.println("Waited for element [" + locator + "] to be clickable for " + timeoutSeconds + " seconds");
       }
   }

   public void waitForOverlayToDisappear(By overlayElement, int timeoutSeconds) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(overlayElement));
	    } catch (Exception e) {
	        System.err.println("Overlay did not disappear within " + timeoutSeconds + " seconds.");
	    }
	}
}
