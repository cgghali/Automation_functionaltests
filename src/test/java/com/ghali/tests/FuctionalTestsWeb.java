package com.ghali.tests;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.ghali.automation.library.constants.Constants;
import com.ghali.automation.library.factory.DriverFactory;
import com.ghali.automation.library.factory.UtilityFactory;
import com.ghali.automation.library.interfaces.DriverInterface;
import com.ghali.pages.DemoLoginPage;
import com.ghali.pages.DemoPageFactory;

public class FuctionalTestsWeb extends BaseTest {

	private DriverInterface driverInterface;
	private DemoPageFactory demoPageFactory;
	private DemoLoginPage loginPage;

	@Test
	public void LoginTest() throws MalformedURLException, InterruptedException {

		this.driverInterface = DriverFactory.getInstance(Constants.DriverNames.CHROME).getDriverInterface();
		this.demoPageFactory = new DemoPageFactory(driverInterface);
		loginPage = this.demoPageFactory.getLoginPage();
		loginPage.navigateToHomePage("http://demo.guru99.com/test/newtours/index.php");
		loginPage.Login();
		UtilityFactory.getJavaUtils().sleep(1000);
		assertEquals(loginPage.LogingSuccess(), "Login Successfully");
		this.driverInterface.closeDriver();
	}
}
