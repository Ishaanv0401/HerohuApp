package com.herohuapp.Pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage
{
	private By Add_RemoveElement=By.xpath("//a[text()='Add/Remove Elements']");
	private By Checkboxes_Btn=By.xpath("//a[text()='Checkboxes']");
	
	public Add_RemoveElement_Pg ClickOnAddRemoveBtn()
	{
		clickBtn(Add_RemoveElement);
		return new Add_RemoveElement_Pg();
	}
	public Checkbox_Page clickon_Checkboxes_Btn()
	{
		clickBtn(Checkboxes_Btn);
		return new Checkbox_Page();
	}

}
