package Genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Base_Test implements Constant {
	public WebDriver driver;
	@BeforeMethod
	public void openapp(){

		System.setProperty(Gecko_key, Gecko_value);
		driver=new FirefoxDriver();
		driver.get("https://www.shine.com/");
		driver.get(Excel.excelsheet(EXCEL_PATH,"Sheet1",0,0));

	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
