package com.ghali.tests;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.ghali.automation.library.constants.Constants;
import com.ghali.automation.library.factory.DriverFactory;
import com.ghali.automation.library.interfaces.DriverInterface;
import com.ghali.pages.CalculatorPage;
import com.ghali.pages.CalculatorPageFactory;

public class FunctionalTestAndroid extends BaseTest {
	private Logger LOG = LoggerFactory.getLogger(FunctionalTestAndroid.class);
	private DriverInterface driverInterface;
	private CalculatorPageFactory calculatorPageFactory;
	private CalculatorPage calcPage;

	@Test
	public void StartAndroidApp() throws MalformedURLException, InterruptedException {

		LOG.info("Starting android app ");
		this.driverInterface = DriverFactory.getInstance(Constants.DriverNames.ANDROID).getDriverInterface();
		LOG.info("Launched android app ");

	}

	@Test
	public void addNums() throws InterruptedException
	{
		String result;
		this.calculatorPageFactory = new CalculatorPageFactory(driverInterface);

		calcPage = this.calculatorPageFactory.calculatorPage();
		Thread.sleep(1000);
		calcPage.clickCalcButtons('1');
		calcPage.clickCalcButtons('2');
		calcPage.clickCalcButtons('+');
		calcPage.clickCalcButtons('2');
		calcPage.clickCalcButtons('=');
		result = calcPage.getResult().getText();
		LOG.info("Additon of 2 Nos = " + result);
		assertEquals("14", result);

	}

	@Test
	public void subtractNums() throws InterruptedException {
		String result;
		this.calculatorPageFactory = new CalculatorPageFactory(driverInterface);

		calcPage = this.calculatorPageFactory.calculatorPage();
		Thread.sleep(1000);
		calcPage.clickCalcButtons('1');
		calcPage.clickCalcButtons('2');
		calcPage.clickCalcButtons('-');
		calcPage.clickCalcButtons('2');
		calcPage.clickCalcButtons('=');
		result = calcPage.getResult().getText();
		LOG.info("Additon of 2 Nos = " + result);
		assertEquals("10", result);

	}

	@Test
	public void multiplyNums() throws InterruptedException {
		String result;
		this.calculatorPageFactory = new CalculatorPageFactory(driverInterface);

		calcPage = this.calculatorPageFactory.calculatorPage();
		Thread.sleep(1000);
		calcPage.clickCalcButtons('1');
		calcPage.clickCalcButtons('2');
		calcPage.clickCalcButtons('x');
		calcPage.clickCalcButtons('2');
		calcPage.clickCalcButtons('=');
		result = calcPage.getResult().getText();
		LOG.info("Additon of 2 Nos = " + result);
		assertEquals("24", result);

	}

	@Test
	public void divideNums() throws InterruptedException {
		String result;
		this.calculatorPageFactory = new CalculatorPageFactory(driverInterface);

		calcPage = this.calculatorPageFactory.calculatorPage();
		Thread.sleep(1000);
		calcPage.clickCalcButtons('1');
		calcPage.clickCalcButtons('2');
		calcPage.clickCalcButtons('/');
		calcPage.clickCalcButtons('2');
		calcPage.clickCalcButtons('=');
		result = calcPage.getResult().getText();
		LOG.info("Additon of 2 Nos = " + result);
		assertEquals("6", result);

	}

}
