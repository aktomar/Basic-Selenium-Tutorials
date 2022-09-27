package Selenium_Tutorial_classes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impliment_window_Handles_functionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		driver.findElement(By.xpath("//*[text()='New Browser Window']")).click();
		
//		String str = driver.getWindowHandle();	
//		
//		String title = driver.getTitle();
//		
//		System.out.println(title);
//		
//		
//		driver.findElement(By.xpath("//*[text()='New Browser Tab']")).click();
//		
//		
//		
//		
//		//getWindowHandles() : This methods return window/borwser keys id....
		Set <String> str = driver.getWindowHandles();
		
		for(String i:str) {
			
			//Here we are print each window id...
			System.out.println(i);
			
			//Here we are printing the title each opened window...
		String t = driver.switchTo().window(i).getTitle();
		System.out.println(t);
			
			if(t.contains("NxtGen A.I Academy – Learn With Clarity")) {
				
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.close();
			}
		
	}
		
		Thread.sleep(7000);
		
		driver.quit();
	}
	
	
	}


