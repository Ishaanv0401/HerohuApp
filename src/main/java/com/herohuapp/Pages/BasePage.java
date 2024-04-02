package com.herohuapp.Pages;

import org.openqa.selenium.*;

public class BasePage 
{
	public static WebDriver driver;
	
	public void setdriver(WebDriver driver)
	{
		BasePage.driver=driver;
	}
	protected WebElement FindElement(By Locator)
	{
		return driver.findElement(Locator);
	}
	
	protected void clickBtn(By locator)
	{
		FindElement(locator).click();
	}
	protected void entertext(By locator, String testdata)
	{
		FindElement(locator).sendKeys(testdata);
	}
	protected String gettext(By locator) 
	{
		String text=FindElement(locator).getText();
		System.out.println("Locator label is"+text);
		return text;
	}
}
