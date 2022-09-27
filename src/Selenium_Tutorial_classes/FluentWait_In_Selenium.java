package Selenium_Tutorial_classes;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;




public class FluentWait_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		driver.manage().window().maximize();
		
		
		WebElement buttonclick = driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button"));
		
		System.out.println(buttonclick.getText());
		
		
		//Applied fluent wait on web element
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				;
				
		
		WebElement date = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.xpath("//*[text()='Software Testing Material - DEMO PAGE']"));
			}
			
		});
		
		
		//WebElement date = driver.findElement(By.xpath("//*[text()='We Are ThemeFusion']"));
		
		
		
		System.out.println(date.getText());
		
		
		
		driver.quit();

	}

}
