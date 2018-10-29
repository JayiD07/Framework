package org.framework.Framework;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Junit extends Locators{

//public static WebDriver driver;
	
	@BeforeClass
	
	public static void beforeClass() {
				getBrowser("https://www.facebook.com");
				
	}
	
	@AfterClass
	public static void afterClass() {
		
		quitApp(driver);

	}

	@Before
	
	public void beforeMethod() {
		Date d=new Date();
		System.out.println(d);

	}
	
	@After
	public void AfterMethod() {
		Date d=new Date();
		System.out.println(d);

	}
	
	@Test
	
	public void test() throws IOException {
		
		for (int i = 0; i <=5;) {
			
			for (int j = 0; j <=0;) {
				
				passingValues(getTxtuname(), getData(i,j));
				int k=j+1;
				passingValues(getTxtpwd(), getData(i,k));
				clickMethod(getBtnlogin());
				driver.navigate().to("https://www.facebook.com");
				j++;
			}
			i++;
		}
		
		
		

	}
}
