package com.ghali.pages;

import com.ghali.automation.library.interfaces.DriverInterface;

public class CalculatorPageFactory {

	private DriverInterface driverInterface;

	public CalculatorPageFactory(DriverInterface driverInterface) {
		this.driverInterface = driverInterface;
	}

	public CalculatorPage calculatorPage()
	{
		return new CalculatorPage(driverInterface);
	}

}
