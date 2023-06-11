/**
 * 
 */
package TestClass;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import PageObjects.IndexPage;
import PageObjects.ProductSearchPage;
import TestBase.BaseClass;


/**
 * @author kpkmt942
 *
 */
public class TC_001_IndexPage_Test extends BaseClass{
	
	
	 static IndexPage ip;
	 static ProductSearchPage ProductSearchPage;
	 

		@BeforeClass
		public static void setUp() throws Throwable {
			Launch_Application();
			ip = new IndexPage(driver); // Initialize the indexPage object
		}
	  
		@Test(groups="Smoke",priority=1)
		public  void LogoTest()
		{
		//IndexPage ip=new IndexPage(driver);
		boolean logo=ip.VerifyLogo();
		Assert.assertTrue(logo);
		}
		
		
		@Test(groups="Smoke",priority = 2)
		public  static void TitleTest()
		{
		//IndexPage ip=new IndexPage(driver);
		String ActualTitle=ip.GetCurrentTitle();
		String presentTitle="Your Store";
		Assert.assertEquals(ActualTitle, presentTitle);
		}
	
		@Test(groups="Sanity",priority = 3)
		public static void AccountSetuptest()
		{
		//IndexPage ip=new IndexPage(driver);
		ip.Click_MyAccount();
		ip.ClickOn_LogIn();
		
		
		//Without logIn
		ProductSearchPage=ip.ProductSearch(rb.getString("product1"));
		
//		hp.Click_MyAccount();
		
		
		}
	

}
