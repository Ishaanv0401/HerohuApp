package com.herohuapp.Pages;

import org.openqa.selenium.By;

public class Checkbox_Page extends BasePage
{
	public By checkbox_btn1=By.xpath("//input[@type='checkbox'][1]");
	public By checkbox_btn2=By.xpath("//input[@type='checkbox'][2]");
	
	public void SelectCheckbox()
	{
		clickBtn(checkbox_btn1);
		clickBtn(checkbox_btn2);
	}

}
