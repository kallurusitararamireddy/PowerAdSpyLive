package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;
import com.power.qa.base.TestBase;
import com.power.qa.pages.Reddit_Pages;




public class Verify_Reddit_Functionality_Of_RightSide_Icon_TestScript extends TestBase{

	@Test
	public void Reddit_Functionality_Of_RightSide_Icon_TestScript() throws Exception
	{
		Reddit_Pages rightsideicon= new Reddit_Pages(getDriver());
		rightsideicon.Redditfunctionality_Of_RightSide_Icon();
		rightsideicon.InvitedFirend();
		rightsideicon.Youtube();
		rightsideicon.Twitter();
		rightsideicon.BookDemo();

	}
}
