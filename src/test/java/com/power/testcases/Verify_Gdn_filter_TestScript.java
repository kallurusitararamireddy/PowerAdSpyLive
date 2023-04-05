package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;


import com.power.qa.pages.Gdn_Pages;

public class Verify_Gdn_filter_TestScript extends TestBase
{
	@Test
	public void Verify_Gdn_filter_TestScript() throws Exception
	{
		Gdn_Pages filter=new Gdn_Pages(getDriver());
		
		filter.GdnPageFilters();
		filter.verify_language();
		filter.verify_filter_Country();
		
	
			
		
		
		
	}
}
