package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;
import com.power.qa.base.TestBase;
import com.power.qa.pages.Google_Pages;



public class Verify_Google_Functionality_Of_RightSide_Icon_TestScript extends TestBase{

	@Test
	public void Facebook_Functionality_Of_RightSide_Icon_TestScript() throws Exception
	{
		Google_Pages rightsideicon= new Google_Pages(getDriver());
		rightsideicon.Googlefunctionality_Of_RightSide_IconPage();
		rightsideicon.CreateRequest();
		rightsideicon.InvitedFirend();
		rightsideicon.Youtube();
		rightsideicon.Twitter();
		rightsideicon.BookDemo();

	}
}
