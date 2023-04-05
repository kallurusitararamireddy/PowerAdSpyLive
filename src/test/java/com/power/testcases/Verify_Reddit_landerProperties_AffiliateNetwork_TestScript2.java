package com.power.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Reddit_Pages;
import com.power.qa.util.Helpers;

public class Verify_Reddit_landerProperties_AffiliateNetwork_TestScript2 extends TestBase
{
	@Test
	public void Verify_Reddit_landerProperties_AffiliateNetwork_TestScript () throws Exception
	{
		Reddit_Pages Reddit_landerProperties=new Reddit_Pages(getDriver());
		Reddit_landerProperties.RdditPagelanderProperties();
		
	
	
		
		Reddit_landerProperties.AffiliateNetwork();
		
			
		
		
		
	}}