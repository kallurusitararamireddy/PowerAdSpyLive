package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Pages;



public class Verify_Facebook_filter_language_TestScript extends TestBase
{
	@Test
	public void Verify_Facebook_filter_language_TestScript() throws Exception
	{
		Facebook_Pages filter=new Facebook_Pages(getDriver());
		
		filter.FacebookFilters();
		
		filter.verify_language();
			
		
		
		
	}
}
