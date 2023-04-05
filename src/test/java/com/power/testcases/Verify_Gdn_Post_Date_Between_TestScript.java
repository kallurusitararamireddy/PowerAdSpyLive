package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Gdn_Pages;



public class Verify_Gdn_Post_Date_Between_TestScript extends TestBase{
	@Test
	public void Verify_Gdn_Post_Date_Between_TestScript() throws Exception
	{
		Gdn_Pages Gdn_post_date_between_page=new Gdn_Pages(getDriver());
		Gdn_post_date_between_page.GdnPagePost_Date_Between_Page();
		Gdn_post_date_between_page.PostDateBetween_All(); 
		Gdn_post_date_between_page.PostDateBetween_Today();
		Gdn_post_date_between_page.PostDateBetween_Yesterday();
		Gdn_post_date_between_page.PostDateBetween_Last_Seven_Days();
		Gdn_post_date_between_page.PostDateBetween_Last_Thirty_Days();
		Gdn_post_date_between_page.PostDateBetween_This_Month();
		Gdn_post_date_between_page.PostDateBetween_Last_Month();
	//	Gdn_post_date_between_page.PostDateBetween_CustomRange();
	
	}
}
