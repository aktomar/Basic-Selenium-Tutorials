package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseEvent_DragAndDrop_part02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		driver .switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		
		WebElement src = driver.findElement(By.id("draggable"));
		
		//Drag and drop by passing axis details.....
		
	   //	act.dragAndDropBy(src, 126, 90).build().perform();
		
		
		
		//Drag and Drop by : Click and Hold and movetoOffset......
		
		act.clickAndHold(src).moveByOffset(0,90).release().perform();	
		 
		 Thread.sleep(3000);
		
		driver.quit();

	}

}
