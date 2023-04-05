package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;
import com.power.qa.base.TestBase;
import com.power.qa.pages.Gdn_Pages;




public class Verify_Gdn_Functionality_Of_RightSide_Icon_TestScript extends TestBase{

	@Test
	public void Gdn_Functionality_Of_RightSide_Icon_TestScript() throws Exception
	{
		Gdn_Pages rightsideicon= new Gdn_Pages(getDriver());
		rightsideicon.Gdnfunctionality_Of_RightSide_Icon_Page();

		rightsideicon.InvitedFirend();
		rightsideicon.Youtube();
		rightsideicon.Twitter();
		rightsideicon.BookDemo();

	}
}
