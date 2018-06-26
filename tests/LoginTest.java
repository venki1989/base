package com.base.tests;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.base.pageobject.*;
import com.base.setup.TestBase;

public class LoginTest extends TestBase{

	@Test
	public void init() throws InterruptedException{

		//driver.get("https://www.facebook.com");
		HomePage loginLink = PageFactory.initElements(driver, HomePage.class);
		loginLink.clickOnLoginLink();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.setEmail("ttran40");
		loginpage.clickAway();
		loginpage.setPassword("welcome*123");
		loginpage.clickAway();
		loginpage.clickOnLoginButton();
		Thread.sleep(20000);
		//loginLink.EditIcon();
		Thread.sleep(20000);
		//HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		loginLink.LogOut();
		System.out.println("Application is logged in and Logged out successfully");
	}

}
