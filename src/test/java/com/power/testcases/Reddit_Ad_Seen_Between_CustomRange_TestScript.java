package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Reddit_Pages;


public class Reddit_Ad_Seen_Between_CustomRange_TestScript extends TestBase
{
	@Test
	public void Reddit_Ad_Seen_Between_CustomRange_TestScript() throws InterruptedException
	{
		Reddit_Pages ad_seen_between=new Reddit_Pages(getDriver());
		
		ad_seen_between.RedditPageAd_Seen_Between();
	
		
		ad_seen_between.AdSeenBetween_CustomRange();
		
			
		
	}
}
