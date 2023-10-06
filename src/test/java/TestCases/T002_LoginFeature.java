package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class T002_LoginFeature {
	@Test
	public void loginMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.nobrokerhood.com/");
		driver.findElement(By.xpath("//div[@class='nb__GGkUH']")).click();
		driver.findElement(By.xpath("//div[@class='nb__3aZfk']//input[@placeholder='Email']")).sendKeys("mamaearth@nobroker.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("nobroker1");
		driver.findElement(By.xpath("//div[@class='nb__1Zwxx'][normalize-space()='Login']")).click();
		driver.quit();
	}

}
