package com.power.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.PinterestPage;
import com.power.qa.pages.linkedIn_landerProperties_page;
import com.power.qa.util.Helpers;

public class Verify_Pinterest_landerProperties_Filters_Search_by_Country_TestScript extends TestBase
{
	@Test
	public void Verify_Pinterest_landerProperties_Filters_Search_by_Country_TestScript() throws Exception
	{
		PinterestPage pinterest=new PinterestPage(getDriver());
	
		pinterest.PinterestInPageFilters();
		pinterest.verify_filtersSearchByCounrty();

	
		
			
		
		
		
	}}