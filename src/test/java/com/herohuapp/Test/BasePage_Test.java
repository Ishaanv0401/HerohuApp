package com.herohuapp.Test;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.herohuapp.Pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage_Test 
{
	protected WebDriver driver;
	protected BasePage base_pg;
	private final String Aut_url="https://the-internet.herokuapp.com/";
	
	@BeforeClass
	public void browserSetup()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	@BeforeMethod
	public void launchapplication()
	{
		driver.get(Aut_url);
		base_pg=new BasePage();
		base_pg.setdriver(driver);
	}
	@AfterMethod
	public void takescreenshotforfailure(ITestResult testResult)
	{
		if(ITestResult.FAILURE==testResult.getStatus())
		{
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty
		("user.dir")+"/Resources/Screenshots/"+testResult.getName()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	} 

}
