package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Google_Pages;


public class Verify_Google_Post_Date_Between_TestScript extends TestBase{
	@Test
	public void Verify_Google_Post_Date_Between_TestScript() throws Exception
	{
		Google_Pages Google_post_date_between_page=new Google_Pages(getDriver());
	Google_post_date_between_page.GooglePagePost_Date_Between();
	Google_post_date_between_page.PostDateBetween_All(); 
	Google_post_date_between_page.PostDateBetween_Today();
	Google_post_date_between_page.PostDateBetween_Yesterday();
	Google_post_date_between_page.PostDateBetween_Last_Seven_Days();
	Google_post_date_between_page.PostDateBetween_Last_Thirty_Days();
	Google_post_date_between_page.PostDateBetween_This_Month();
	Google_post_date_between_page.PostDateBetween_Last_Month();
//	Google_post_date_between_page.PostDateBetween_CustomRange();
	}
}
