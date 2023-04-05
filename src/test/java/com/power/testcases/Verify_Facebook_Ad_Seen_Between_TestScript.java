package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Pages;


public class Verify_Facebook_Ad_Seen_Between_TestScript extends TestBase
{
	@Test
	public void Facebook_Ad_Seen_Between_TestScript() throws InterruptedException
	{
		Facebook_Pages ad_seen_between=new Facebook_Pages(getDriver());
		ad_seen_between.FacebookPageAdSeenBetween();
		
		
		
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
