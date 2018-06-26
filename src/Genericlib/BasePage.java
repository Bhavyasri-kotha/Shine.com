package Genericlib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage extends Base_Test {
public WebDriver driver;
	public static void visibility(WebElement element,WebDriver driver)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element found",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element not found",true);
			Assert.fail();
		}
	}
	public void titlecontains(String tit)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.titleContains(tit));
			Reporter.log("title found",true);
		}
		catch(Exception e)
		{
			Reporter.log("title not found",true);
			Assert.fail();
		}
	}

}
