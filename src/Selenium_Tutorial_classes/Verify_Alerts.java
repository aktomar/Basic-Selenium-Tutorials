package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		// 01 -> Normal alert...
		
//		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();		
//		Thread.sleep(3000);		
//		String text = driver.switchTo().alert().getText();		
//		if(text.contains("I am an alert box!")) {			
//			System.out.println("Alert is present !! ");
//		}		
//		driver.switchTo().alert().accept();
		
		
		
		
		
//		02 -> Confirmation alert......
		
//		driver.findElement(By.xpath("//*[text()='Confirm Alert Box']")).click();
//		Thread.sleep(2000);
//		//driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		WebElement ele = driver.findElement(By.id("demo"));
//		String text = ele.getText();
//		System.out.println(text);
		
		
//		03 -> Prompt alert.....
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		driver.switchTo().alert().sendKeys("hiii");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();;
		WebElement ele = driver.findElement(By.id("demoone"));
		String text = ele.getText();
		System.out.println(text);
		if(text.contains("Thanks for Liking Automation")) {
			
			System.out.println("user entered YES then clicked on OK button");
		}
		
		else if (text.contains("Sad to hear it !")){
			
			System.out.println("user entered NO then clicked on OK button");
			
		}
		
		else {
			
			System.out.println("user entered anything then clicked on CANCLE button");
		}
		
		
		Thread.sleep(5000);		
		
		
		
		driver.quit();
		
		
		
		
	}

}
