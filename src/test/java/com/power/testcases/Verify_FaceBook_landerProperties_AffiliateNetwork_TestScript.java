package com.power.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Pages;
import com.power.qa.pages.Google_Pages;
import com.power.qa.util.Helpers;

public class Verify_FaceBook_landerProperties_AffiliateNetwork_TestScript extends TestBase
{
	@Test
	public void Verify_FaceBook_landerProperties_AffiliateNetwork_TestScript () throws Exception
	{
		Facebook_Pages Facebook_landerProperties=new Facebook_Pages(getDriver());
		Facebook_landerProperties.FacebookPagelanderProperties();
		

		Facebook_landerProperties.AffiliateNetwork();
	
		
			
		
		
		
	}}