package TestCases;

import org.testng.annotations.Test;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	Faker faker = new Faker();

	@Test
	public void main() {
		Faker faker = new Faker();
		String streetName = faker.address().streetName();
		String number = faker.address().buildingNumber();
		String city = faker.address().city();
		String country = faker.address().country();
        String numb= faker.phoneNumber().cellPhone();
        String phoneNumber= numb.replace("-", "").replace(" ", "");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.12.1");
		System.out.println(streetName);
		System.out.println(number);
		System.out.println(city);
		System.out.println(country);
		System.out.println(phoneNumber);

		driver.quit();

	}

}
