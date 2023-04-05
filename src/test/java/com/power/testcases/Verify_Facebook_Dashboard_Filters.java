package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;
import com.power.qa.base.TestBase;
import com.power.qa.pages.DashboardPage;




public class Verify_Facebook_Dashboard_Filters extends TestBase{
	
	
	@Test
	public void Verify_Fb_Filters () throws InterruptedException {
		//extent.createTest("Dashboard_test");		
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.fb_Search();
		
	}
}
