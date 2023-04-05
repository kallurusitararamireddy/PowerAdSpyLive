package com.power.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.linkedIn_landerProperties_page;
import com.power.qa.util.Helpers;

public class Verify_linkedIn_landerProperties_TestScript extends TestBase
{
	@Test
	public void Verify_linkedIn_landerProperties_TestScript () throws Exception
	{
		linkedIn_landerProperties_page linkedIn_landerProperties=new linkedIn_landerProperties_page(getDriver());
		linkedIn_landerProperties.LinkedInPagelanderProperties();
		
		linkedIn_landerProperties.AffiliateNetwork();

	
		
			
		
		
		
	}}