package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Frames_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		//To find number of frames available on web pages......
		
		int total_Frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Numbers of frames Available on Webpages --->> "+total_Frames);
		
		//Switching to the frame and access web-element present in frame
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techworlds...");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
