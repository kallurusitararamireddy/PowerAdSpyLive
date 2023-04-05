package com.power.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
@Listeners(ITestNGListener.class)

public class LoginPage  extends BasePage{
	
	Helpers helper=new Helpers();
	
	public LoginPage(WebDriver driver) throws InterruptedException {
		super(TestBase.getDriver());
	}
	
	
	//ELEMENTS ON LOGIN PAGE:
	@FindBy(xpath = "//input[@id='amember-login']")
	WebElement input_username;

	@FindBy(xpath = "//input[@id='amember-pass']")
	WebElement input_password;
	
	@FindBy(xpath = "(//div[@class='recaptcha-checkbox-border'])[1]")
	WebElement captchRobot;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement Button_login;
	
	@FindBy(xpath="//button[@class='dropdown-toggle language_dropdown_btn']")
	  WebElement languageDropdown;
	
	@FindBy(xpath = "//span[@class='guided-tour-step-button guided-tour-step-button-complete']")
	WebElement NewFeatureClosedButton;

	
	public void login(String un, String pwd) throws InterruptedException{
		
		
		
		helper.highLightElement(driver, input_username);
		input_username.sendKeys(un);
		Reporter.log("<B><font color = 'blue'>Username .</font></B> Entered User ID");		
		
		helper.highLightElement(driver, input_password);
		input_password.sendKeys(pwd);
		Reporter.log("<B><font color = 'blue'>Password .</font></B> Entered Password");
		
		try {
			driver.switchTo().frame(0);
			helper.highLightElement(driver, captchRobot);
			captchRobot.click();
			Reporter.log("<B><font color = 'blue'>Password .</font></B> Entered captchRobot");
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			System.out.println("PowerAdSpy Site");
			Reporter.log("<B><font color = 'blue'>Password .</font></B> PowerAdSpy Site");
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Robot Capture is not present");
			Reporter.log("<B><font color = 'blue'>Password .</font></B> Robot Capture is not present");
			System.out.println("PowerAdSpy this is Dev Site");
			Reporter.log("<B><font color = 'blue'>Password .</font></B> PowerAdSpy this is Dev Site");
		}
		
		try {
			Thread.sleep(8000);
			//Thread.sleep(15000);
			helper.highLightElement(driver, Button_login);
			Button_login.click();		
			Reporter.log("<B><font color = 'blue'>Sign In Button .</font></B> Clicked on Submit Button");
			
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
		helper.waitForPageToLoad();
	    helper.waitForpage();
	    
	    try {
	    	helper.waitFor(NewFeatureClosedButton);
	    	helper.Scrollintoview(NewFeatureClosedButton);
	    	helper.highLightElement(driver, NewFeatureClosedButton);
	    	NewFeatureClosedButton.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		helper.waitFor(languageDropdown);
	    helper.highLightElement(driver, languageDropdown);
	    languageDropdown.click();
	    
	    Thread.sleep(2000);
	    List<WebElement> languageDropDown = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu top_nav_dropdown_form user_dropdown_div language_')]/ul/li"));
	    for (WebElement language : languageDropDown) {
	      String actualText = language.getText();
	      System.out.println("actualText : " + actualText);
	      if(actualText.equals("English")) {
	        Thread.sleep(3000);
	        language.click();
	        break;
	      }
	      
	    }
	    helper.waitForPageToLoad();
	    helper.waitForpage();
	    
	    try {
	    	helper.waitFor(NewFeatureClosedButton);
	    	helper.Scrollintoview(NewFeatureClosedButton);
	    	helper.highLightElement(driver, NewFeatureClosedButton);
	    	NewFeatureClosedButton.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	    
	    Thread.sleep(2000);
	    helper.waitForPageToLoad();
	    helper.waitForpage();
		
		}
	}	