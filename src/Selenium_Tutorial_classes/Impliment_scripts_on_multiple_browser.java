package Selenium_Tutorial_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Impliment_scripts_on_multiple_browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch application on chrome browser......
		
//		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.quit();
		
		// Launch application on firebox browser......
		
//		System.setProperty("webdriver.gecko.driver","D:\\Automation\\DRIVER\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.quit();


		// Launch application on micorsoftEdge browser......
		
		System.setProperty("webdriver.edge.driver","D:\\Automation\\DRIVER\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();  
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
