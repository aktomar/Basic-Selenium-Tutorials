package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent_KeyUp_and_KeyDown_part02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("Soyas Tomar");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("Soyastomar1234@gmail.com");
		
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("c-45,chandni chowk, delhi");
		
		
		
		Actions act = new Actions(driver);
		
		//Selecting current address...
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		//Copying current address text...
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		//Pressing TAB moving to next field...
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
		//Pasting the current address text in to permanent address text field....
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		
		
		Thread.sleep(7000);
		
		driver.quit();
		
		
		
		
		

	}

}
