package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		driver.manage().window().maximize();
		
	//	WebElement ele = driver.findElement(By.id("visibleAfter"));
		
		WebDriverWait wait =  new WebDriverWait (driver,5);
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
		
		System.out.println("TEXT VISIBLE -->>"+ele.getText());
		
		
		driver.quit();
		
		

	}

}
