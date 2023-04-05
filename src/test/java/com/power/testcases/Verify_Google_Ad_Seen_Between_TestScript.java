package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Google_Pages;


public class Verify_Google_Ad_Seen_Between_TestScript extends TestBase
{
	@Test
	public void Google_Ad_Seen_Between_TestScript() throws Exception
	{
		Google_Pages ad_seen_between=new Google_Pages(getDriver());

		ad_seen_between.GooglePageAd_Seen_Between();

		ad_seen_between.AdSeenBetween_All();  

		ad_seen_between.AdSeenBetween_Today();

		ad_seen_between.AdSeenBetween_Yesterday();

		ad_seen_between.AdSeenBetween_Last_Seven_Days();

		ad_seen_between.AdSeenBetween_Last_Thirty_Days();

		ad_seen_between.AdSeenBetween_This_Month();

		ad_seen_between.AdSeenBetween_Last_Month();

	//	ad_seen_between.AdSeenBetween_CustomRange();


	}
}
