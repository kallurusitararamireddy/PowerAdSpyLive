package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;

import com.power.qa.pages.Reddit_Pages;


public class Verify_Reddit_Post_Date_Between_TestScript extends TestBase{
	@Test
	public void Verify_Reddit_Post_Date_Between_TestScript() throws Exception
	{
		Reddit_Pages Reddit_post_date_between_page=new Reddit_Pages(getDriver());
		Reddit_post_date_between_page.RedditPagePost_Date_Between();
		Reddit_post_date_between_page.PostDateBetween_All(); 
		Reddit_post_date_between_page.PostDateBetween_Today();
		Reddit_post_date_between_page.PostDateBetween_Yesterday();
		Reddit_post_date_between_page.PostDateBetween_Last_Seven_Days();
		Reddit_post_date_between_page.PostDateBetween_Last_Thirty_Days();
		Reddit_post_date_between_page.PostDateBetween_This_Month();
		Reddit_post_date_between_page.PostDateBetween_Last_Month();
	//	Reddit_post_date_between_page.PostDateBetween_CustomRange();
	
	}
}
