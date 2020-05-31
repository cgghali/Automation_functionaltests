package com.ghali.pages;

import com.ghali.automation.library.interfaces.DriverInterface;

public class DemoPageFactory {


	private DriverInterface driverInterface;

	public DemoPageFactory(DriverInterface driverInterface) {
		this.driverInterface = driverInterface;
	}

	public DemoLoginPage getLoginPage()
	{
		return new DemoLoginPage(driverInterface);
	}
}

