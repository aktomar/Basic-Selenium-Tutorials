package Selenium_Tutorial_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impliments_tables_in_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	  //  driver.get("https://demo.guru99.com/test/web-table-element.php#");
	    
	    driver.get("https://demo.guru99.com/test/table.html");
	    
	    
	    //Static table
	    
	    List<WebElement> tcol = driver.findElements(By.xpath("//*[@align='center']"));
	    System.out.println("STATIC : Table columns - "+tcol.size());
	   
	    List<WebElement> trow = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
	    System.out.println("STATIC : Table rows - "+trow.size());
	    
	    WebElement text = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[1]"));
	    String str1 = text.getText();
	    
	    System.out.println(str1);
	    
	    
	    
	    //To Find total numbers of Rows and columns in dynamic table....
	    
//	    List <WebElement> tablecolumns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//	    System.out.println("TOTAL COLUMNS IN TABLE : "+tablecolumns.size());
//	    List<WebElement> tablerows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
//        System.out.println("TOTAL ROWS IN TABLE : "+tablerows.size());
	    
	    
	  //  Fetching cell value of a particular row and column of the Dynamic Table
	    
//	    WebElement tr = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
//	    WebElement rowtext = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[1]"));
//	    String str1 = tr.getText();
//	    System.out.println("THITRD ROW VALUE :"+str1);
	    
//	    WebElement tc = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
//	    String str2 = tc.getText();
//	    System.out.println("SECOND COLUMN VALUE :"+str2);
	    
	    driver.quit();
	    
	    
	    
	    
	    
	    
	   
	   

	}

}
