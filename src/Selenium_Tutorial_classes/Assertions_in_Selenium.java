package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_in_Selenium {
 
	     // TODO Auto-generated method stub
		
		//Soft-Assertion 
		//Create a test cases
		
//		@Test(description ="To verify soft assertion...")
//		public void SoftAssertionOne() throws InterruptedException {
//			
////			SoftAssert temp = new SoftAssert();
////			System.out.println("Starting testcase one ..........");
////			temp.assertEquals(34,35,"Testcase failed");
////			System.out.println("Testcase passed ..........");
//			
//			
//			System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//			driver.manage().window().maximize();
//			Thread.sleep(5000);
//			WebElement dropdownvalues  = driver.findElement(By.xpath("//select[@id=\"first\"]"));
//			Thread.sleep(2000);
//		    Select values = new Select(dropdownvalues);
//			values.selectByVisibleText("Yahoo");
//			
//			//It should be failed here but it's not 
//			//Here we used soft assertion thats why it continue the excution of other test cases.
//			
//			SoftAssert temp = new SoftAssert();
//		    temp.assertEquals("Yahoo","Bings"); 
//		    
//	        WebElement seletedvalue = values.getFirstSelectedOption();
//			String str = seletedvalue.getText();
//			System.out.println("Seleted Value : -> "+str);
//			
//			
//			
//			
//		}
		
		//Create another test cases to verify hard assertion....
		
		@Test(description ="To verify Hard assertion...")
		public void HardAssertionOne() throws InterruptedException {
			
//			SoftAssert temp = new SoftAssert();
//			System.out.println("Starting testcase one ..........");
//			temp.assertEquals(34,35,"Testcase failed");
//			System.out.println("Testcase passed ..........");
			
			
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			WebElement dropdownvalues  = driver.findElement(By.xpath("//select[@id=\"first\"]"));
			Thread.sleep(2000);
		    Select values = new Select(dropdownvalues);
			values.selectByVisibleText("Yahoo");
			
			//It should be failed here but it's not 
			//Here we used soft assertion thats why it continue the excution of other test cases.
			
			
		    Assert.assertEquals("Yahoo","Bings");
		    
	        WebElement seletedvalue = values.getFirstSelectedOption();
			String str = seletedvalue.getText();
			System.out.println("Seleted Value : -> "+str);
		
		}

	

}
