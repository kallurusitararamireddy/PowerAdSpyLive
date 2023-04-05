package com.power.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Gdn_Pages;
import com.power.qa.util.Helpers;

public class Verify_Gdn_landerProperties_EcommercePlatform_TestScript extends TestBase
{
	@Test
	public void Verify_Gdn_landerProperties_EcommercePlatform_TestScript () throws Exception
	{
		Gdn_Pages Gdn_landerProperties=new Gdn_Pages(getDriver());
		Gdn_landerProperties.GdnPagelanderProperties();
		
		Gdn_landerProperties.EcommercePlatform();
	
		
		
	
			
	}}