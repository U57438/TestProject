package practiseproject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindow {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\com\\zanmi\\naukri\\driver\\chromedriver.exe");
				System.out.println(System.getProperty("user.dir"));
				WebDriver driver=new ChromeDriver();
				driver.get("http://demo.guru99.com/V4/");
				Set<String> windows=driver.getWindowHandles();
		
	
		
	}

}
