package com.herohuapp.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.herohuapp.Pages.Checkbox_Page;
import com.herohuapp.Pages.LandingPage;

public class CheckboxesPage_Test extends BasePage_Test
{
	private LandingPage landing_Pg;
	private Checkbox_Page checkbox_pg=new Checkbox_Page();
	WebElement checkbox1;
	WebElement checkbox2;
	Boolean checkbox_status;
	
  @Test
  public void VerifyCheckboxes_linkBtn() 
  {
	  landing_Pg=new LandingPage();
	  landing_Pg.clickon_Checkboxes_Btn();
	  checkbox1=driver.findElement(checkbox_pg.checkbox_btn1);
	  checkbox_status=checkbox1.isDisplayed();
	  assertEquals(true, checkbox_status);
  }
  
  @Test
  public void verifycheckboxes_Btn()
  {
	  landing_Pg.clickon_Checkboxes_Btn();
	  checkbox1=driver.findElement(checkbox_pg.checkbox_btn1);
	  checkbox2=driver.findElement(checkbox_pg.checkbox_btn2);
	  Boolean cb1status_Beforeclick=checkbox1.isSelected();
	  Boolean cb2status_Beforeclick=checkbox2.isSelected();
	  System.out.println("\n Before click of Checkbox 1 selected status is "
	  		+cb1status_Beforeclick + "\n Before click of checkbox 2 status is "+cb2status_Beforeclick);
	  //click on checkbox 1 and checkbox 2 only if both checkboxes are unchecked 
	  if(checkbox1.isSelected()==false)
	  {
		  if(checkbox2.isSelected()==true)
		  checkbox_pg.SelectCheckbox();
	  }
	  
	  Boolean cb1status_AfterClick=checkbox1.isSelected();
	  Boolean cb2status_AfterClick=checkbox2.isSelected();
	  System.out.println("\n After click of Checkbox 1 selected status is "
		  		+cb1status_AfterClick + "\n After click of checkbox 2 status is "+cb2status_AfterClick);
	  
	  assertEquals(cb1status_AfterClick,true);
	  assertEquals(cb2status_AfterClick,false);
  }
}
