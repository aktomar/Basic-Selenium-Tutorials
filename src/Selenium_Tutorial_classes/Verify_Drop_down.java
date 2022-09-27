package Selenium_Tutorial_classes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Drop_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement dropdownvalues  = driver.findElement(By.xpath("//select[@id=\"first\"]"));
		
		Thread.sleep(2000);
	
		Select values = new Select(dropdownvalues);
		
		//values.selectByIndex(2);
		//values.selectByValue("Google");
		values.selectByVisibleText("Yahoo");
		
		//To display the selected value in drop down
		
		WebElement seletedvalue = values.getFirstSelectedOption();
		
		String str = seletedvalue.getText();
		
		System.out.println("Seleted Value : -> "+str);
		
		//values.selectByIndex(2);
		
		
		
//		values.selectByValue("Yahoo");
//		values.selectByIndex(0);
//		values.selectByVisibleText("Yahoo");	

		
// To display all the value Available in the drop down.....
		
		System.out.println("Value Available the drop-down : ");
		List<WebElement> val = values.getOptions();
		
		for(WebElement ele : val)
		{
			String ddownvalues = ele.getText();
			System.out.println(ddownvalues);
			
		}
		
       
		
		
		
		
		//SelectByValue
		
		
		Thread.sleep(6000);
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
