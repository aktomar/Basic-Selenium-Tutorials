package Selenium_Tutorial_classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents_Sendkeys_part01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/login.html");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.id("email")).sendKeys("astomar12345@gmail.com");
		
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("India@2022")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB).click()
		.build().perform();

		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
