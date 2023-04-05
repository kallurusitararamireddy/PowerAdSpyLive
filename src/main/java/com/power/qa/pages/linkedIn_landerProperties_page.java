package com.power.qa.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;
import com.power.qa.util.ReadConfig;

public class linkedIn_landerProperties_page extends BasePage
{
	Helpers helper=new Helpers();

	public linkedIn_landerProperties_page(WebDriver driver) throws InterruptedException 
	{
		super(TestBase.getDriver());
	} 


	@FindBy(xpath = "//span[@class='guided-tour-step-button guided-tour-step-button-complete']")
	WebElement NewFeatureClosedButton;
	@FindBy(xpath = "//img[@class='active_pg_logo img-fluid']")
	WebElement Logo;

	@FindBy(css = "img[src='/assets/imgs/linkedin.png']")
	WebElement linked;

	@FindBy(xpath = "//span[@class='dropdown-label dropdown_filter']")
	WebElement sortBy;

	@FindBy(xpath = "//a[normalize-space()='Newest']")
	WebElement SortBy_Newest;

	@FindBy(id = "search-ads")
	WebElement searchButton;

	@FindBy(id="totaladscount")
	WebElement toatal_Count_Ads;

	@FindBy(css = ".clear_filters")
	WebElement Clear_Filters;

	@FindBy(xpath = "//button[normalize-space()='Lander Properties']")
	WebElement landerProperties;

	@FindBy(css =".btn.btn-primary.btn-lg.dropdown-toggle.top_dropdown_btn.introjs-step-5")
	WebElement landerProperties1;

	@FindBy(xpath = "//input[@placeholder='Ecommerce Platform']")
	WebElement ecommerceplatform;

	@FindBy(id="marketing")
	WebElement MarketingPlatform;

	@FindBy(id = "affiliates")
	WebElement AffiliateNetwork;


	@FindBy(id = "destination_url")
	WebElement link1;



	@FindBy(xpath = "(//div[@class='card_col_1']//img[@class='shopify_icon'])[1]")
	WebElement image1;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[1]")
	WebElement ShowAnalytics1;

	@FindBy(xpath = "(//div[@class='card_col_2']//img[@class='shopify_icon'])[1]")
	WebElement image2;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[1]")
	WebElement ShowAnalytics2;

	@FindBy(xpath = "(//div[@class='card_col_3']//img[@class='shopify_icon'])[1]")
	WebElement image3;
	@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[1]")
	WebElement ShowAnalytics3;

	@FindBy(xpath = "(//div[@class='card_col_1']//img[@class='shopify_icon'])[2]")
	WebElement image4;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[2]")
	WebElement ShowAnalytics4;

	@FindBy(xpath = "(//div[@class='card_col_2']//img[@class='shopify_icon'])[2]")
	WebElement image5;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[2]")
	WebElement ShowAnalytics5;

	@FindBy(xpath = "(//div[@class='card_col_3']//img[@class='shopify_icon'])[2]")
	WebElement image6;
	@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[2]")
	WebElement ShowAnalytics6;

	@FindBy(xpath = "(//div[@class='card_col_1']//img[@class='shopify_icon'])[3]")
	WebElement image7;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[3]")
	WebElement ShowAnalytics7;

	@FindBy(xpath = "(//div[@class='card_col_2']//img[@class='shopify_icon'])[3]")
	WebElement image8;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[3]")
	WebElement ShowAnalytics8;

	@FindBy(xpath = "(//div[@class='card_col_3']//img[@class='shopify_icon'])[3]")
	WebElement image9;
	@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[3]")
	WebElement ShowAnalytics9;

	@FindBy(xpath = "(//div[@class='card_col_1']//img[@class='shopify_icon'])[4]")
	WebElement image10;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[4]")
	WebElement ShowAnalytics10;

	@FindBy(xpath = "(//div[@class='card_col_2']//img[@class='shopify_icon'])[4]")
	WebElement image11;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[4]")
	WebElement ShowAnalytics11;

	@FindBy(xpath = "(//div[@class='card_col_3']//img[@class='shopify_icon'])[4]")
	WebElement image12;
	@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[4]")
	WebElement ShowAnalytics12;

	@FindBy(xpath = "(//div[@class='card_col_1']//img[@class='shopify_icon'])[5]")
	WebElement image13;
	@FindBy(xpath = "(//div[@class='card_col_1']//a[text()='Show Analytics'])[5]")
	WebElement ShowAnalytics13;

	@FindBy(xpath = "(//div[@class='card_col_2']//img[@class='shopify_icon'])[5]")
	WebElement image14;
	@FindBy(xpath = "(//div[@class='card_col_2']//a[text()='Show Analytics'])[5]")
	WebElement ShowAnalytics14;

	@FindBy(xpath = "(//div[@class='card_col_3']//img[@class='shopify_icon'])[5]")
	WebElement image15;
	@FindBy(xpath = "(//div[@class='card_col_3']//a[text()='Show Analytics'])[5]")
	WebElement ShowAnalytics15;
	@FindBy(xpath="//a[@id='destination_url']")
	WebElement destinationUrl;

	
	
	public void LinkedInPagelanderProperties() throws Exception
	{
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into PowerAdSpy Application");
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);

		helper.waitForPageToLoad();
		helper.waitFor(Logo);
		helper.highLightElement(driver, Logo);
		Assert.assertTrue(Logo.isDisplayed(), "Power Ad Spy Logo is Dispalyed");
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Power Ad Spy Logo is Displayed");

		helper.waitFor(linked);
		helper.highLightElement(driver, linked);
		linked.click();
		Assert.assertTrue(linked.isDisplayed(), "PowerAdSpy | Linkedin Dashboard");
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On LinkedIn Icon");
		helper.waitForPageToLoad();
		try {
	    	helper.waitFor(NewFeatureClosedButton);
	    	helper.Scrollintoview(NewFeatureClosedButton);
	    	helper.highLightElement(driver, NewFeatureClosedButton);
	    	NewFeatureClosedButton.click();
		} catch (Exception e) {
			// TODO: handle exception
		}

		Reporter.log("       " );
		Reporter.log("<B><font color = 'purple'>  - ShortBy Newest Step will Start from here </font>  ");
		helper.waitFor(sortBy);
		helper.highLightElement(driver, sortBy);
		sortBy.click();
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Clicked On sortBy Icon");

		helper.waitFor(SortBy_Newest);
		helper.highLightElement(driver, SortBy_Newest);
		helper.Scrollintoview(SortBy_Newest);
		SortBy_Newest.click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On SortBy Newest Icon");

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		searchButton.click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Clicked On search Button Icon");
		helper.waitForPageToLoad();


	}

	public void AffiliateNetwork() throws InterruptedException
	{

		helper.waitFor(landerProperties);
		helper.highLightElement(driver, landerProperties);
		landerProperties.click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font> Clicked On Lander Properties Button Icon");

		helper.waitFor(AffiliateNetwork);
		helper.highLightElement(driver, AffiliateNetwork);
		helper.Scrollintoview(AffiliateNetwork);
		Reporter.log("<B><font color = 'orange'> Step5 -</font> Clicked On Affiliate Network click");
		System.out.println("Clicked On Affiliate Network click Icon");

		Reporter.log(" ");
		Reporter.log("<B><font color = 'Green'>- Affiliate Network </font>");
		Reporter.log("       :-"+ReadConfig.getProperty("Afliated"));
		helper.SelectDropdownValue(AffiliateNetwork,ReadConfig.getProperty("Afliated"));

		helper.SelectDropdownValue(AffiliateNetwork,ReadConfig.getProperty("Afliated"));
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Selected  On Affiliate Network"+ReadConfig.getProperty("Afliated"));
		System.out.println("Selected On Affiliate Network "+ReadConfig.getProperty("Afliated"));

		helper.waitFor(searchButton);
		helper.highLightElement(driver, searchButton);
		helper.Scrollintoview(searchButton);
		searchButton.click();
		helper.waitForPageToLoad();
		Reporter.log("<B><font color = 'orange'> Step2 -</font> Clicked On search Button Icon");

		helper.waitForPageToLoad();
		helper.waitFor(toatal_Count_Ads);
		helper.highLightElement(driver, toatal_Count_Ads);
		helper.jsCLick(toatal_Count_Ads);
		String Total_Ads_Count_newest=toatal_Count_Ads.getText();
		Reporter.log("<B><font color = 'orange'> Step3 -</font> Total_Ads_Count_newest= " + Total_Ads_Count_newest);
		System.out.println("Total_Ads_Count_newest: "+Total_Ads_Count_newest);







		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 1 Ad -</font>  ");
			System.out.println("");
			System.out.println("1 Ad");

			helper.waitFor(ShowAnalytics1);
			helper.highLightElement(driver, ShowAnalytics1);
			helper.Scrollintoview(ShowAnalytics1);
			 linkText1 = ShowAnalytics1.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics1.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 2 Ad -</font>  ");
			System.out.println("");
			System.out.println("2 Ad");

			helper.waitFor(ShowAnalytics2);
			helper.highLightElement(driver, ShowAnalytics2);
			helper.Scrollintoview(ShowAnalytics2);
			 linkText1 = ShowAnalytics2.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics2.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 3 Ad -</font>  ");
			System.out.println("");
			System.out.println("3 Ad");

			helper.waitFor(ShowAnalytics3);
			helper.highLightElement(driver, ShowAnalytics3);
			helper.Scrollintoview(ShowAnalytics3);
			 linkText1 = ShowAnalytics3.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics3.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 4 Ad -</font>  ");
			System.out.println("");
			System.out.println("4 Ad");

			helper.waitFor(ShowAnalytics4);
			helper.highLightElement(driver, ShowAnalytics4);
			helper.Scrollintoview(ShowAnalytics4);
			 linkText1 = ShowAnalytics4.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics4.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 5 Ad -</font>  ");
			System.out.println("");
			System.out.println("5 Ad");

			helper.waitFor(ShowAnalytics5);
			helper.highLightElement(driver, ShowAnalytics5);
			helper.Scrollintoview(ShowAnalytics5);
			 linkText1 = ShowAnalytics5.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics5.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 6 Ad -</font>  ");
			System.out.println("");
			System.out.println("6 Ad");

			helper.waitFor(ShowAnalytics6);
			helper.highLightElement(driver, ShowAnalytics6);
			helper.Scrollintoview(ShowAnalytics6);
			 linkText1 = ShowAnalytics6.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics6.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 7 Ad -</font>  ");
			System.out.println("");
			System.out.println("7 Ad");

			helper.waitFor(ShowAnalytics7);
			helper.highLightElement(driver, ShowAnalytics7);
			helper.Scrollintoview(ShowAnalytics7);
			 linkText1 = ShowAnalytics7.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics7.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 8 Ad -</font>  ");
			System.out.println("");
			System.out.println("8 Ad");

			helper.waitFor(ShowAnalytics8);
			helper.highLightElement(driver, ShowAnalytics8);
			helper.Scrollintoview(ShowAnalytics8);
			 linkText1 = ShowAnalytics8.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics8.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 9 Ad -</font>  ");
			System.out.println("");
			System.out.println("9 Ad");

			helper.waitFor(ShowAnalytics9);
			helper.highLightElement(driver, ShowAnalytics9);
			helper.Scrollintoview(ShowAnalytics9);
			 linkText1 = ShowAnalytics9.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics9.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 10 Ad -</font>  ");
			System.out.println("");
			System.out.println("10 Ad");

			helper.waitFor(ShowAnalytics10);
			helper.highLightElement(driver, ShowAnalytics10);
			helper.Scrollintoview(ShowAnalytics10);
			 linkText1 = ShowAnalytics10.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics10.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 11 Ad -</font>  ");
			System.out.println("");
			System.out.println("11 Ad");

			helper.waitFor(ShowAnalytics11);
			helper.highLightElement(driver, ShowAnalytics11);
			helper.Scrollintoview(ShowAnalytics11);
			 linkText1 = ShowAnalytics11.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics11.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 12 Ad -</font>  ");
			System.out.println("");
			System.out.println("12 Ad");

			helper.waitFor(ShowAnalytics12);
			helper.highLightElement(driver, ShowAnalytics12);
			helper.Scrollintoview(ShowAnalytics12);
			 linkText1 = ShowAnalytics12.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics12.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 13 Ad -</font>  ");
			System.out.println("");
			System.out.println("13 Ad");

			helper.waitFor(ShowAnalytics13);
			helper.highLightElement(driver, ShowAnalytics13);
			helper.Scrollintoview(ShowAnalytics13);
			 linkText1 = ShowAnalytics13.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics13.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 14 Ad -</font>  ");
			System.out.println("");
			System.out.println("14 Ad");

			helper.waitFor(ShowAnalytics14);
			helper.highLightElement(driver, ShowAnalytics14);
			helper.Scrollintoview(ShowAnalytics14);
			 linkText1 = ShowAnalytics14.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics14.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
		
		
		

		try
		{

			String linkText1 =null;
			String linkText=null;
			Reporter.log(" ");
			Reporter.log("<B><font color ='red'> 15 Ad -</font>  ");
			System.out.println("");
			System.out.println("15 Ad");

			helper.waitFor(ShowAnalytics15);
			helper.highLightElement(driver, ShowAnalytics15);
			helper.Scrollintoview(ShowAnalytics15);
			 linkText1 = ShowAnalytics15.getAttribute("href");
			helper.getAdID(linkText1);
			System.out.println("Clicked On ShowAnalytics Icon");
			Reporter.log("<B><font color = 'blue'> ==> -</font> Clicked On ShowAnalytics Icon");
			ShowAnalytics15.click();

			Set<String> S1=driver.getWindowHandles();
			Iterator<String>it=S1.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			helper.waitForpage();
			helper.waitForPageToLoad();
			helper.waitFor(destinationUrl);
			helper.Scrollintoview(destinationUrl);
			helper.jsCLick(destinationUrl);
			helper.waitForPageToLoad();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			//switch to new tab
			driver.switchTo().window(newTb.get(2));
			System.out.println("Page title of new tab: " + driver.getTitle());
			linkText = driver.getPageSource();
			helper.AssertAffiliateNetwork(linkText);
			helper.waitForPageToLoad();
			
			driver.close();
			//    switch to parent window
			driver.switchTo().window(newTb.get(1));
			driver.close();
			driver.switchTo().window(newTb.get(0));
		}

		catch (Exception e) {
			System.out.println("Image is not able: Oops! Looks like we don't have data for this search criteria yet.");

			Reporter.log("<B><font color = 'red'> ==> -</font> Image is not able: Oops! Looks like we don't have data for this search criteria yet.");
		}
	}
}