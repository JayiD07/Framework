package org.framework.Framework;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Testng {
WebDriver driver;
	@BeforeMethod
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KS\\Framework\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
driver.get("https://www.facebook.com");
Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
Assert.assertTrue(driver.getTitle().contains("sign up"));

	}
@AfterClass 
public void afterClass() {
	driver.quit();

}
@Test
public void test1() {
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys("java");
	Assert.assertEquals("java", element.getAttribute("value"));
	WebElement element2 = driver.findElement(By.id("pass"));
	element2.sendKeys("welcome");
	//Assert.assertEquals("pass",element2.getAttribute("value"));
	WebElement btnlogin = driver.findElement(By.xpath("//input[@value='Log In']"));
	btnlogin.click();
	//Assert.assertEquals(driver.getCurrentUrl().contains("Login_attempt");
	Assert.assertTrue(driver.getCurrentUrl().contains("login_attempt"));
}
          
@AfterMethod
public void after() {
	Date d =new Date();
	System.out.println(d);

}
@BeforeClass
public void before() {
	Date d=new Date();
	System.out.println(d);

}
}


