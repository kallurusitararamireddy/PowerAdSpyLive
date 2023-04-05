package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Google_Pages;



public class Verify_Google_filter_TestScript extends TestBase
{
	@Test
	public void Verify_Google_filter_TestScript() throws Exception
	{
		Google_Pages filter=new Google_Pages(getDriver());
		
		filter.GoogleFilters();

		filter.verify_filter_Country();
			
		
		
		
	}
}
