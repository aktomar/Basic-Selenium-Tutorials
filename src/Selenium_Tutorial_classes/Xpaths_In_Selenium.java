package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		


	//	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("1234567890");;
		
	//	driver.findElement(By.xpath("//*[contains(@id,\"email\")]")).sendKeys("1234567890");;
		
	//	driver.findElement(By.xpath("//*[starts-with(@aria-label,\"Email\")]")).sendKeys("1234567890");
		
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
