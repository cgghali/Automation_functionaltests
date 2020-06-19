package com.ghali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ghali.automation.library.interfaces.DriverInterface;
import com.ghali.automation.library.pages.common.AbstractWebDriverPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorPage extends AbstractWebDriverPage {

	public CalculatorPage(DriverInterface driverInterface) {
		super(driverInterface);
		PageFactory.initElements(new AppiumFieldDecorator((AndroidDriver<?>) driverInterface.getDriver()), this);
	}

	@AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
	private WebElement zero;

	@AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
	private WebElement one;

	@AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
	private WebElement two;

	@AndroidFindBy(id = "com.google.android.calculator:id/op_add")
	private WebElement plus;

	@AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
	private WebElement minus;

	@AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
	private WebElement multiply;

	@AndroidFindBy(id = "com.google.android.calculator:id/op_div")
	private WebElement divide;

	@AndroidFindBy(id = "com.google.android.calculator:id/eq")
	private WebElement equals;

	@AndroidFindBy(id = "com.google.android.calculator:id/result_final")
	private WebElement result;


	public void clickCalcButtons(char num) {
		switch (num) {
		case '0':
			clickElement(zero);
			break;
		case '1':
			clickElement(one);
			break;
		case '2':
			clickElement(two);
			break;
		case '+':
			clickElement(plus);
			break;
		case '-':
			clickElement(minus);
			break;
		case 'x':
			clickElement(multiply);
			break;
		case '/':
			clickElement(divide);
			break;
		case '=':
			clickElement(equals);
			break;
		}

	}

	public WebElement getResult() {
		return result;
	}

}
