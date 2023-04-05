package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;
import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Pages;



public class Verify_Facebook_Functionality_Of_RightSide_Icon_TestScript extends TestBase{

	@Test
	public void Facebook_Functionality_Of_RightSide_Icon_TestScript() throws Exception
	{
		Facebook_Pages rightsideicon= new Facebook_Pages(getDriver());
		rightsideicon.FacebookFacebook_functionality_Of_RightSide_Icon_Page();
		rightsideicon.CreateRequest();
		rightsideicon.InvitedFirend();
		rightsideicon.Youtube();
		rightsideicon.Twitter();
		rightsideicon.BookDemo();

	}
}
