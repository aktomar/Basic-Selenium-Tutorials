package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent_click_and_doubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebSite to test Double-click operation : https://unixpapa.com/js/testmouse.html
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation\\DRIVER\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://unixpapa.com/js/testmouse.html");
			
		 driver.manage().window().maximize();
		 
		 Actions act = new Actions(driver);
		 
		 WebElement ele = driver.findElement(By.xpath("//*[text()='click here to test']"));
		 
		 //ele.click();
		 
	      act.doubleClick(ele).perform();
		 
		 String text = ele.getText();
		 
		 System.out.println(text);
		 
		 Thread.sleep(5000);
		 
		 driver.quit();
		
	}

}
