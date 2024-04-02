package com.herohuapp.Pages;

import org.openqa.selenium.By;

public class Add_RemoveElement_Pg extends BasePage
{
	public By AddElement_Btn=By.xpath("//button[text()='Add Element']");
	public By Delete_Btn=By.xpath("//button[text()='Delete']");
	
	public void AddElement() 
	{
		clickBtn(AddElement_Btn);
		System.out.print("Add button is clicked");
	}
	public void RemoveElement()
	{
		clickBtn(Delete_Btn);
	}
}
