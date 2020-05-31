package com.ghali.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ghali.automation.library.interfaces.DriverInterface;
import com.ghali.automation.library.pages.common.AbstractWebDriverPage;
import com.ghali.constants.Constants;


public class DemoLoginPage extends AbstractWebDriverPage {

	public DemoLoginPage(DriverInterface driverInterface) {
		super(driverInterface);
		org.openqa.selenium.support.PageFactory.initElements((WebDriver) driverInterface.getDriver(), this);
	}

	@FindBy(name = "userName")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "submit")
	private WebElement loginBtn;

	@FindBy(xpath = "//h3['Login Sucussfully']")
	private WebElement loginSuccess;

	public void Login() {
		enterText(userName, Constants.UserCredentials.USER_NAME);
		enterText(password, Constants.UserCredentials.PASSWORD);
		clickElement(loginBtn);
	}

	public void navigateToHomePage(String url) {

		navigateTo(url);
	}

	public String LogingSuccess() {
		waitForElementTextVisibility(loginSuccess, loginSuccess.getText());
		return loginSuccess.getText();

	}

}
