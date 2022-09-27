package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Navigate Commands : navigate(),getCurrentUrl(), refresh(),forward(), backward(),navigate.to()

public class Impliment_Navigate_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	   Actions act = new Actions(driver);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		
     	WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
//		
      	act.sendKeys("https://nxtgenaiacademy.com/multiplewindows/");
		act.sendKeys(Keys.ENTER);
     	act.build().perform();
//		
		Thread.sleep(5000);
//		
//		
    	driver.navigate().back();
//		
		Thread.sleep(5000);
//		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		
		
		driver.quit();
	    
	
	   
	    
	}

}
