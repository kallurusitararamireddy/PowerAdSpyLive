package com.power.testcases;

import java.util.Iterator;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Gdn_Pages;


public class Verify_Gdn_SortBy_TestScript extends TestBase {
@Test
public void Verify_Gdn_SortBy_TestScript () throws Exception 
{
	Gdn_Pages gdn_sortBy=new Gdn_Pages(getDriver());
	gdn_sortBy.GdnpageSortBy();
	gdn_sortBy.Gdn_SortBy_Newest();
	gdn_sortBy.Gdn_SortBy_LastSeen();
	gdn_sortBy.Gdn_SortBy_RunningLongest();
	gdn_sortBy.SortBy_Domain_Registration_Date();
}

}
