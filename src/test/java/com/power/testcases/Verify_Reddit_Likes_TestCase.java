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

public class Verify_Reddit_Likes_TestCase extends TestBase
{
	@Test
	public void Verify_Reddit_Likes_TestCase () throws Exception
	{
		Reddit_Pages RdLike=new Reddit_Pages(getDriver());
		
		RdLike.RdSortByLike();
		RdLike.SortByLike();
	

	}
}
