package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("vfb-7-1")).click();
		
		driver.findElement(By.id("vfb-6-0")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
