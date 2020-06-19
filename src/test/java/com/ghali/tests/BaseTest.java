package com.ghali.tests;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.ghali.automation.library.constants.Constants;
import com.ghali.automation.library.constants.Constants.DriverNames;
import com.ghali.automation.library.factory.UtilityFactory;

public class BaseTest {

	public Map<String, String> configMap = new ConcurrentHashMap<>();
	private String driver;

	@BeforeTest
	public void BeforeTest() {

		this.driver = UtilityFactory.getJavaUtils().getConfigMap().get(Constants.GenericConstants.DRIVER_NAME);
		if (this.driver.equals((DriverNames.ANDROID)) || this.driver.equals((DriverNames.IOS))) {
			UtilityFactory.getAppiumUtils().startAppiumServer(this.driver);
		}
	}

	@AfterTest
	public void closeAppium() throws IOException {
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("taskkill /F /IM node.exe");
		runtime.exec("taskkill /F /IM cmd.exe");
	}


}
