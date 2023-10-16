package com.MGS.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.MGS.pageObjects.HomePage;
import com.MGS.testComponent.BaseTest;

public class CermatiAssigment extends BaseTest {

	@Test(priority = 1)
	public void TC01_Access_Product_via_Applying_Multiple_Filters() {
		String filterBycondition = "Condition", filterByprice = "Price", filterByLocation = "Item Location";
		String PhoneConditionType = "New";
		String fromPrice = "230", toPrice = "500";
		String location = "US Only";
		HomePage users = new HomePage(driver);

		log.debug("[ Clicking on [Shop By Category ]");
		users.clickingOnshopByCategoryBtn();

		log.debug("[ Clicking on [cell Phones And Accessories ]");
		users.selectingPhonesAndSmartphones();
		log.debug("[ Selecting [Phones And Smartphones ]");

		log.debug("[ Clicking " + filterBycondition + "And Selecting" + PhoneConditionType + " option ]");
		users.applyConditionFilter(filterBycondition, PhoneConditionType);

		log.debug("[ Clicking on " + filterByprice + ",Entering From " + fromPrice + " And To " + toPrice + "] Amount");
		users.applyPriceFilter(filterByprice, fromPrice, toPrice);

		log.debug("[ Clicking on " + filterByLocation + "And Selecting " + location + " Option ");
		users.applyItemLocationFilter(filterByLocation, location);

		log.debug("[ Validating  Applied Condition  Tag ]");
		String actualConditionTag = users.getPhoneCondtionTagText();
		AssertJUnit.assertEquals(actualConditionTag, filterBycondition);

		log.debug("[ Validating  Applied Price Tag ");
		String priceTageText = users.getPriceFilterTagText();
		AssertJUnit.assertEquals(priceTageText, filterByprice);

		log.debug("[ Validating  Applied Item Location Tag ]");
		String actualItemLocationTag = users.getItemLocationTagText();
		AssertJUnit.assertEquals(actualItemLocationTag, filterByLocation);

	}

	@Test(priority = 2)
	public void TC02_Access_Product_via_Search() {
		String item = "c1700s";
		String productCategory = "Antiques";
		HomePage users = new HomePage(driver);

		log.debug("[ Entering " + item + " in Searchbar & Selecting " + productCategory + "from DropDown ]");
		users.SerchItemInSearchbar(item, productCategory);
		log.debug("[ clicking on Search Button ]");

		log.debug("[ Validating First Result Name Match  with Search string.]");
		String actualText = users.getFirstResultValidation();
		AssertJUnit.assertTrue(actualText.contains(item));

	}

}
