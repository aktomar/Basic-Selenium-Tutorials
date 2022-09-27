package Selenium_Tutorial_classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent_RightClick_and_ContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String RightClick = "/html/body/div/section/div/div/div/p/span";
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement rightClickbtn = driver.findElement(By.xpath(RightClick));
		
		//Here we are performing rightClick mouse events....
		
		act.contextClick(rightClickbtn).build().perform();
		
		Thread.sleep(3000);
		
		WebElement ElementCopy = driver.findElement(By.xpath("//*[text()='Copy']"));
		
		ElementCopy.click();
		
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		
		String alertText = al.getText();
		
		System.out.println("TEXT PRESENT ON ALERT IS : --->> "+alertText);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
