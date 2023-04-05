package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Google_Pages;


public class Verify_Google_SortBy_TestScript extends TestBase {
@Test	
public void Verify_Google_SortBy_TestScript() throws Exception
{
	Google_Pages google_SortBy=new  Google_Pages(getDriver());
	google_SortBy.GooglepageSortBy();
	google_SortBy.Google_SortBy_Newest();
	google_SortBy.Google_SortBy_LastSeen();
	google_SortBy.Google_SortBy_RunningLongest();
	google_SortBy.SortBy_Domain_Registration_Date();
}
}
