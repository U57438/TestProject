package com.selenium.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.generic.Generickeywords;

public class LoginTest {
	private Generickeywords keyword;
	
	
	
	// below code will get execute only once before all the test cases
	@BeforeClass
	public void setUp() throws Throwable {
		keyword = new Generickeywords();		
		keyword.launchBrowser("Chrome");
	}
	
	
	
	
	@Test
	public void sellerLogin(){
		keyword.navigate("url");
	}
	
}
