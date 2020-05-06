package com.selenium.generic;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Generickeywords {

	static WebDriver driver;
	private Properties prop;
	
	public Generickeywords() throws IOException {
			FileReader fs=new FileReader("Auction.properties");
			
			prop= new Properties();
			prop.load(fs);
			
	}
	
	public void launchBrowser(String browsertype) throws Throwable							
    {		
       	
 		if (browsertype.equals("Chrome")){

 			System.setProperty("webdriver.chrome.driver","D:\\Training\\UST -  batches\\selenium\\drivers\\chromedriver.exe"); 
 			 			driver = new ChromeDriver();

 			}else
 				
	 			if (browsertype.equals("Mozilla")){
//	 				
	 					
	 				driver = new FirefoxDriver();
	 				
	 					}else
	 		 				
	 			 			if (browsertype.equals("IE")){
	 			 				System.setProperty("webdriver.ie.driver", "D:\\Training\\UST -  batches\\selenium\\drivers\\IEDriverServer.exe");
	 			 				
	 			 					
	 			 				driver = new InternetExplorerDriver();
	 			 				
	 			 					}
	 			
 			driver.manage().window().maximize();
 			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		
 			
    }
	
	public void navigate(String url){
	driver.get(prop.getProperty(url));
		
	}
	
	public void Click(String locator){
		getObject(locator);
	}
	
	public void input(String locator,String data){
		getObject(locator).sendKeys(data);
	}
	
	public WebElement getObject(String locator){
		WebElement e=null;
		
		try{
		
		if(locator.endsWith("_xpath")){	
			e=driver.findElement(By.xpath(prop.getProperty(locator)));
			
		}else if(locator.endsWith("_id")){
			e=driver.findElement(By.id(prop.getProperty(locator)));
			
		}else if(locator.endsWith("_name")){
			e=driver.findElement(By.name(prop.getProperty(locator)));
			
		}else if(locator.endsWith("_linkText")){
			e=driver.findElement(By.linkText(prop.getProperty(locator)));
			
		}else if(locator.endsWith("_tagName")){
			e=driver.findElement(By.tagName(prop.getProperty(locator)));
			
		}
		}catch(Exception x){
			//report error
			x.printStackTrace();
		}
		return e;
	}

}
