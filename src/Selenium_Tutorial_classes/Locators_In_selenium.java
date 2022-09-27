package Selenium_Tutorial_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_In_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//

		//driver.findElement(By.name("txtUsername")).sendKeys("Admin123456788");
		
		//driver.findElement(By.className("textInputContainer")).sendKeys("Admin123456788");
		
		//driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin123456788");
		
		//driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("adminerrt455667");
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		// driver.findElement(By.partialLinkText("Forgot")).click();
		
		int ele = driver.findElements(By.tagName("a")).size();
		
		System.out.println(ele);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       Thread.sleep(5000);
       
		
	// By id, class,name, xpath,css selector,linktext, partialink text, tagname, img
		
		driver.quit();

	}

}
