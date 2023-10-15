package com.MGS.pageObjects;

import org.openqa.selenium.*;
import com.MGS.utilities.AbstractComponent;

public class EbayPage extends AbstractComponent {
	static WebDriver driver;

	public EbayPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By shopByCategoryBtn = By.id("gh-shop-a");
	private By cellPhonesAndAccessories = By.xpath("//a[contains(text(),'Cell phones & accessories')]");
	private By cellPhonesAndSmartphones = By.xpath("//a[text()='Cell Phones & Smartphones']");
	private By allFilters = By.xpath("(//ul[@class='brm__list']//li//button)[last()]");
	private By pricedfrom = By.xpath("//input[contains(@aria-label,'Minimum Value')]");
	private By pricedTo = By.xpath("//input[contains(@aria-label,'Maximum Value')]");
	private By applyFilterBtn = By.cssSelector("button[aria-label='Apply']");
	private By appliedFilterbtn = By.xpath("//*[@class='x-flyout__button']//*[contains(.,'filters applied')]");
	private By searchLocator = By.xpath("//input[@id='gh-ac'  or @placeholder ='Search for anything']");
    private By categoryDropdownLocator  = By.id("gh-cat");
	private By searchBtnLocatoer = By.id("gh-btn");
	private By searchResultLocator = By.xpath("(//ul[contains(@class, 'srp-list')]/li//a/div/span/ancestor::a)[1]");
	

	public void SerchItemInSearchbar(String item, String productCategory) {
		WebElement searchInputElement = driver.findElement(searchLocator); 
		waitForElementToBeClickable(driver, searchLocator, 3);
		searchInputElement.sendKeys(item);
		selectDropdownOptionByText(driver, categoryDropdownLocator, productCategory);
		click(searchBtnLocatoer);
	}
	
	public String getFirstResultValidation(){
			String  firstResultText = driver.findElement(searchResultLocator).getText();
			return firstResultText;
	}	
		
	public void clickingOnshopByCategoryBtn() {
		click(shopByCategoryBtn);
	}

	public void selectingPhonesAndSmartphones() {
		try {
			click(cellPhonesAndAccessories);
			waitForElementDisplay(cellPhonesAndSmartphones, 3);
			click(cellPhonesAndSmartphones);
		} catch (Exception e) {
			System.out.println("An exception occurred: " + e.getMessage());
		}
	}

	public void clickingOnAllFiltersBtn() {
		scrollClick(allFilters);
	}

	public void selectFilterOptions(String filterOption) {
			scrollClick(allFilters);
			waitFor(2);
			By element = By.xpath("//div[contains(@id,'c3-mainPanel')]//span[contains(., '" + filterOption + "')]");
			waitForElementClickable(element, 5);
			click(element);
	}

	public void applyingPhoneConditionFilter(String phoneType) {
		try {
			waitForElementDisplay(By.xpath("//span[@class='field']//label[.='" + phoneType + "']"), 5);
			click(By.xpath("//span[@class='field']//label[.='" + phoneType + "']"));
			click(applyFilterBtn);
			waitFor(3);
		} catch (Exception e) {
			System.out.println("An exception occurred while applying the phone condition filter: " + e.getMessage());
		}
	}

	public void appliyingPriceFilter(String minAmt, String maxAmt) {
		try {
			WebElement minPriceElement = driver.findElement(pricedfrom);
			WebElement maxPriceElement = driver.findElement(pricedTo);
			minPriceElement.sendKeys(minAmt);
			maxPriceElement.sendKeys(maxAmt);
			click(applyFilterBtn);
		} catch (Exception e) {
			System.out.println("An exception occurred while applying the price filter: " + e.getMessage());
		}
	}

	public void applyingItemLocationFilter(String itemLocation) {
		try {
			String itemLocationXPath = "//span[contains(text(),'" + itemLocation + "')]//ancestor::span//input";
			WebElement locationElement = driver.findElement(By.xpath(itemLocationXPath));
			locationElement.click();
			click(applyFilterBtn);
			waitFor(2);
		} catch (Exception e) {
			System.out.println("An Error occurred while applying item location filter: " + e.getMessage());
		}
	}

	public String getPhoneCondtionTagText() {
		click(appliedFilterbtn);
		WebElement appliedFileterElement = driver.findElement(By.xpath("(//span[contains(@class,'brm__item-label')])[1]"));
		waitForElementDisplay(appliedFileterElement, 3);
		String text = appliedFileterElement.getText();
		String str []  = text.split(":");
		String phoneCondtionTagText  = str[0];
		return phoneCondtionTagText;
	}
	
	public String getPriceFilterTagText() {
		WebElement element = driver.findElement(By.xpath("(//span[contains(@class,'brm__item-label')])[2]"));
		waitForElementDisplay(element, 3);
		String text = element.getText();
		String str []  = text.split(":");
		String pricefilterTagText = str[0];
		return pricefilterTagText;
	}

	
	public String getItemLocationTagText() {
		WebElement element = driver.findElement(By.xpath("(//span[contains(@class,'brm__item-label')])[3]"));
		waitForElementDisplay(element, 3);
		String text = element.getText();
		String str []  = text.split(":");
		String locationText = str[0];
		return locationText;
	}
	
	

	public String fromPrice() {
		WebElement element = driver.findElement(By.xpath("(//span[contains(@class,'brm__item-label')])[2]"));
		waitForElementDisplay(element, 3);
		String priceFiltertext = element.getText();
		String fromPriceText = priceFiltertext.substring(8, 11);
		return fromPriceText;
	}

	public String toPrice() {
	        WebElement element = driver.findElement(By.xpath("(//span[contains(@class,'brm__item-label')])[2]"));
	        waitForElementDisplay(element, 3);
	        String priceFiltertext = element.getText();
	        String[] price1 = priceFiltertext.split("to");
	        String price2 = price1[1].trim();
	        String toPriceText = price2.substring(1, 4);
	        return toPriceText; 
	}


	public String phoneConditionType() {
		click(appliedFilterbtn);
		WebElement appliedFileterElement = driver
				.findElement(By.xpath("(//span[contains(@class,'brm__item-label')])[1]"));
		waitForElementDisplay(appliedFileterElement, 3);
		String conditinalFiltertext = appliedFileterElement.getText();
		String[] firsrtPart = conditinalFiltertext.split(":");
		String value = firsrtPart[1].trim();
		String[] act = value.split("\\s");
		String actualPhoneCondtionType = act[0].trim();
		return actualPhoneCondtionType;
	}
	

	
	public String itemLocation() {
		WebElement element = driver.findElement(By.xpath("(//span[contains(@class,'brm__item-label')])[3]"));
		waitForElementDisplay(element, 3);
		String text = element.getText();
	    String[] text1 = text.split(":"); 
	    String text2 = text1[1].trim();
		String locationText = text2.substring(0,7);
		return locationText;
	}

}
