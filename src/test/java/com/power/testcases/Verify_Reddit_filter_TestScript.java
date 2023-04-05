package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;


import com.power.qa.pages.Reddit_Pages;

public class Verify_Reddit_filter_TestScript extends TestBase
{
	@Test
	public void Verify_Reddit_filter_TestScript() throws Exception
	{
		Reddit_Pages filter=new Reddit_Pages(getDriver());

		filter.RedditFilters();
		filter.verify_call_To_Action();
		filter.verify_language();
		filter.verify_filter_Country();

	}
}
