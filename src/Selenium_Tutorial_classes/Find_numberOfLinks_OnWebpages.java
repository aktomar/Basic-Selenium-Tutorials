package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_numberOfLinks_OnWebpages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		int numberlinks = driver.findElements(By.tagName("a")).size();
//		
//		System.out.println("Total link present on Webpage are -->> "+numberlinks);
		
	//	driver.findElement(By.xpath("//"));
		
		driver.quit();
		
		
		

	}

}
