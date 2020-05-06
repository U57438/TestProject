package practiseproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") + "\\src\\practiseproject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automatio");
         
		String handel=driver.getWindowHandle();
		System.out.println("hanndel");
		driver.findElement(By.name("New Message Window")).click();
		
	}

}
