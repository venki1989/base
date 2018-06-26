package com.base.setup;

import java.io.IOException;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 
public class TestBase {
 
 public static WebDriver driver = null;
 
 @BeforeSuite
 public void initialize() throws IOException{
 
	 System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
 driver = new FirefoxDriver(); 
 //To maximize browser
                //driver.manage().window().maximize();
                System.out.println("Opened FireFox");
                driver.get("http://msi-vmsupqajnjap.metricstream.com/");
                System.out.println("Entered URL");
 
 }
 
 @AfterSuite
 //Test cleanup
 public void TeardownTest()
    {
        TestBase.driver.quit();
    }
 
}
