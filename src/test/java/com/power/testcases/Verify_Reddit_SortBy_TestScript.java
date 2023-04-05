package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Reddit_Pages;



public class Verify_Reddit_SortBy_TestScript extends TestBase {

	@Test
	public void Verify_Reddit_SortBy_TestScript () throws Throwable {
		
		Reddit_Pages RedditSortBy = new Reddit_Pages(getDriver());
		RedditSortBy.RedditpageSortBy();
		RedditSortBy.Reddit_SortBy_Newest();
		RedditSortBy.Reddit_SortBy_LastSeen();
		RedditSortBy.Reddit_SortBy_RunningLongest();
		RedditSortBy.SortBy_Domain_Registration_Date();
		
	}
}
