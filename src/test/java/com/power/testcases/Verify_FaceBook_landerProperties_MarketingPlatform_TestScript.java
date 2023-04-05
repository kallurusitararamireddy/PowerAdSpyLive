package com.power.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Pages;
import com.power.qa.util.Helpers;

public class Verify_FaceBook_landerProperties_MarketingPlatform_TestScript extends TestBase
{
	@Test
	public void Verify_FaceBook_landerPropertiesMarketingPlatform_TestScript () throws Exception
	{
		Facebook_Pages FaceBook_landerProperties=new Facebook_Pages(getDriver());
		FaceBook_landerProperties.FacebookPagelanderProperties();
		

		FaceBook_landerProperties.MarketingPlatform();
		
	//	FaceBook_landerProperties.AffiliateNetwork();

	
		
			
		
		
		
	}}