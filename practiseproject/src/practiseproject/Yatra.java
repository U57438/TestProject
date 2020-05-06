package practiseproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\practiseproject\\driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.yatra.com/");
				driver.manage().window().maximize();
				WebElement holidays=driver.findElement(By.xpath("//span[text()='Holidays']"));
				holidays.click();
				 Alert alert = driver.switchTo().alert();		
	        		
			        // Capturing alert message.    
			        String alertMessage= driver.switchTo().alert().getText();
				//JavascriptExecutor js = (JavascriptExecutor) driver;
	           // js.executeScript("window.scrollBy(0,350)", "");

	}

}
