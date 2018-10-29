package org.framework.Framework;

import org.framework.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Base {
	
	//public static WebDriver driver;
	
	public Locators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	public WebElement txtuname;
	@FindBy(id = "pass")
	public WebElement txtpwd;
	@FindBy(xpath = "//input[@value='Log In']")
	public WebElement btnlogin;

	public WebElement getTxtuname() {
		return txtuname;
	}

	public WebElement getTxtpwd() {
		return txtpwd;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
