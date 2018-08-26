package script;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeSuite
	public void testBeforeSuite() {
		Reporter.log("Suite Starts",true);
	}
	@AfterSuite
	public void testAfterSuite() {
		Reporter.log("Suite ends",true);
	}
	
	@BeforeTest
	public void testBeforeTest() {
		Reporter.log("Test Starts",true);
	}
	@AfterTest
	public void testAfterTest() {
		Reporter.log("Test Ends",true);
	}
	
	@BeforeClass
		public void testBeforeClass() {
		Reporter.log("Test class Starts",true);
	}

		@AfterClass
			public void testAfterClass() {
			Reporter.log("Test class Ends",true);
}
	
	@BeforeMethod
	public void testBeforeMethod() {
		Reporter.log("Method starts", true);
		}
	@AfterMethod
	public void testAfterMethod() {
		Reporter.log("Method ends", true);
	}
	
	@Test
	public void test1() {
		Reporter.log("Test Method 1",true);
	}
	@Test
	public void test2() {
		Reporter.log("Test Method 2",true);
	}
	@Test
	public void test3() {
		Reporter.log("Test Method 3",true);
	}
	
}
