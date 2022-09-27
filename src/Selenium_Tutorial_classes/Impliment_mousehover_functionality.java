package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Impliment_mousehover_functionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/mouse-hover-in-selenium-webdriver-java");
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"post-694\"]/div/div[2]/div[1]/button[3]"));
		
		act.moveToElement(ele).perform();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
