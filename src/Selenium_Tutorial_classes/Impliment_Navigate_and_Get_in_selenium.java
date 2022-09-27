package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impliment_Navigate_and_Get_in_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		

		//get() is used to navigate particular URL(website) and wait till page load. driver. 
		//navigate() is used to navigate to particular URL and does not wait to page load
		
	//	driver.get("https://nxtgenaiacademy.com/multiplewindows");
		
	//	Thread.sleep(2000);
		
		driver.navigate().to("https://nxtgenaiacademy.com/multiplewindows");
		
		driver.findElement(By.xpath("//*[text()='New Browser Tab']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
