package com.herohuapp.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.herohuapp.Pages.Add_RemoveElement_Pg;
import com.herohuapp.Pages.LandingPage;

public class Add_RemoveElementPage_Test extends BasePage_Test
{
	protected LandingPage landing_pg;
	protected Add_RemoveElement_Pg addRemove_pg=new Add_RemoveElement_Pg();
	
	protected WebElement AddBtn;
	protected WebElement deleteBtn;
	
	protected Boolean AddBtn_status;
	protected Boolean deleteBtn_Status;
	
	@Test(priority=1)
	public void Test_clickonAdd_RemoveElements()
	{
		landing_pg=new LandingPage();
		landing_pg.ClickOnAddRemoveBtn();
		AddBtn=driver.findElement(addRemove_pg.AddElement_Btn);
		AddBtn_status=AddBtn.isDisplayed();
		assertEquals(true, AddBtn_status);
	}
	@Test(priority=2)
	public void Test_clickAddElement()
	{
		landing_pg.ClickOnAddRemoveBtn();
		addRemove_pg.AddElement();
		assertEquals(true, AddBtn_status);
	}
	@Test(priority=3)
	public void Test_deleteBtn()
	{
		landing_pg.ClickOnAddRemoveBtn();
		addRemove_pg.AddElement();
		deleteBtn=driver.findElement(addRemove_pg.Delete_Btn);
		addRemove_pg.RemoveElement();
		assertEquals(true, AddBtn_status);
	}
	
}
