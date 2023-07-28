package listpracticedaily;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart
	  {
		 public static void main(String[] args) {
			//WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 List <WebElement>list=driver.findElements(By.tagName("a"));
			
			 for(WebElement alllist:list) {
				 System.out.println(alllist.getText());
				 
				 }
				 
			
			
			
			}
		}
		 
		

	


