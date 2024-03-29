package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Pages;


public class Verify_FaceBook_Post_Date_Between_TestScript extends TestBase{
	@Test
	public void Verify_FaceBook_Post_Date_Between_TestScript() throws Exception
	{
		Facebook_Pages facebook_post_date_between_page=new Facebook_Pages(getDriver());
	facebook_post_date_between_page.FacebookPagePostDateBetween();
	facebook_post_date_between_page.PostDateBetween_All(); 
	facebook_post_date_between_page.PostDateBetween_Today();
	facebook_post_date_between_page.PostDateBetween_Yesterday();
	facebook_post_date_between_page.PostDateBetween_Last_Seven_Days();
	facebook_post_date_between_page.PostDateBetween_Last_Thirty_Days();
	facebook_post_date_between_page.PostDateBetween_This_Month();
	facebook_post_date_between_page.PostDateBetween_Last_Month();
	//facebook_post_date_between_page.PostDateBetween_CustomRange();
	
	}
}
