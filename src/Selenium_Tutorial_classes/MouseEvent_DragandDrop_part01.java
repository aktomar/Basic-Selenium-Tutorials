package Selenium_Tutorial_classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent_DragandDrop_part01 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actions act;
		WebElement src;
		WebElement dest;
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		act = new Actions(driver);
		
		
		
		try {
			 
			src = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
				dest = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
				
				act.dragAndDrop(src, dest)
				.pause(Duration.ofSeconds(4))
				.moveToElement(dest)
				.pause(Duration.ofSeconds(4))
				.release()
				.pause(Duration.ofSeconds(4)).build().perform();
		}
		
		catch(StaleElementReferenceException e){
			

			driver.quit();
		
			
	}
		
		
		

	}

}
