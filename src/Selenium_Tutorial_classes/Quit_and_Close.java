package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_and_Close {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.epfindia.gov.in/site_en/index.php");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='umang_panel_1']")).click();
		
		Thread.sleep(5000);
		
		//driver.close();
		
		driver.quit();
		
		

	}

}
