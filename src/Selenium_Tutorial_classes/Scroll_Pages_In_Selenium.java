package Selenium_Tutorial_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Scenario 1: To scroll down the web page by pixel.
//Scenario 2: To scroll down the web page by the visibility of the element.
//Scenario 3: To scroll down the web page at the bottom of the page.
//Scenario 4: Horizontal scroll on the web page.

public class Scroll_Pages_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//driver.get("https://www.youtube.com/");  //For 1st
		//driver.get("https://www.canva.com/");    //For 2nd
		driver.get("https://demo.guru99.com/test/guru99home/scrolling.html"); //For horizontal scroll
		
		Thread.sleep(10000);
		
		
//1 - ****** Here we are scrolling WebPages by using pixel....
			
		    // js.executeScript("window.scrollBy(0,3000)");
		
//2 - ******* Here we are scrolling WebPages with visibility of element....
		
		//	WebElement ele = driver.findElement(By.xpath("//*[text()='Built for teamwork']"));
		//	js.executeScript("arguments[0].scrollIntoView();", ele);
		
//3 - ******* Here we are scrolling at bottom of the webpages....
		
		
			//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
//4 - ******* Horizontally scrolling on the webpages.....
		
		WebElement ele = driver.findElement(By.xpath("//*[text()='VBScript']"));
		
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
		
		
		
		
		
		Thread.sleep(10000);
		
		//String text = ele.getText();
		//System.out.println(" Scrolled operation performed text found -->>!!"+text );
		
		driver.quit();
		
		

	}

}
