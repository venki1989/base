package com.base.pageobject;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver)  throws InterruptedException { 
		this.driver=driver; 
	}

	//Using FindBy for locating elements
	@FindBy(how=How.XPATH, using=".//*[@id='loginHref']") WebElement loginLink;
	//private By loginLink = By.id(".//*[@id='loginHref']");
	//private By LogOut = By.id(".//*[@id='ext-gen56']");
//	@FindBy(how=How.XPATH, using="//a[contains(text(), 'VCRM - Product Risk Assessment Plan - Imetelstat')]//..//..//..//..//td//div[@class='x-grid3-cell-inner x-grid3-col-9']//a//img[@id='image1']") WebElement EditIcon;
	@FindBy(how=How.XPATH, using=".//*[@id='ext-gen56']") WebElement LogOut;


	// Defining all the user actions (Methods) that can be performed in the Facebook home page

	// This method to click on Profile Dropdown
	public void clickOnLoginLink(){
		((WebElement) loginLink).click();
	}
	// This method to click on Logout link
	public void LogOut(){
		((WebElement) LogOut).click();
	}
	
	/*public void EditIcon() {
		((WebElement) EditIcon).click();
	}*/


}
