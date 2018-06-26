package com.base.pageobject;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver){ 
		this.driver=driver; 
	}

	//Using FindBy for locating elements
	@FindBy(how=How.XPATH, using=".//*[@id='login']") WebElement UserName;
	//private By UserName = By.id(".//*[@id='loginHref']");
	@FindBy(how=How.XPATH, using=".//*[@id='password']") WebElement Password;
	//private By Password = By.id(".//*[@id='password']");
	@FindBy(how=How.XPATH, using=".//*[@id='go']") WebElement signinButton;
	//private By signinButton = By.id(".//*[@id='go']");
	@FindBy(how=How.XPATH, using=".//*[@id='member_log_in']/label[3]") WebElement clickAway;
	//private By clickAway = By.id(".//*[@id='member_log_in']/label[3]']");

	// Defining all the user actions (Methods) that can be performed in the Facebook home page

	// This method is to set Email in the email text box
	public void setEmail(String strEmail){
		((WebElement) UserName).sendKeys(strEmail);
	}
	// This method is to set Password in the password text box
	public void setPassword(String strPassword){
		((WebElement) Password).sendKeys(strPassword);
	}

	public void clickAway() {
		((WebElement) clickAway).click();

	}
	
	// This method is to click on Login Button
	public void clickOnLoginButton(){
		((WebElement) signinButton).click();
	} 
}
