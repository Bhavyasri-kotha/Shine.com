package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FollowCareer {
	public WebDriver driver;
	//Declaration
	@FindBy(xpath="//div[@class='up']")
	private WebElement signinbttn;
	@FindBy(id="id_email_login")
	private WebElement emailtb;
	@FindBy(id="id_password")
	private WebElement pwdtb;
	@FindBy(name="login_popup")
	private WebElement loginbtn;
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[4]")
	private WebElement morebtn;
	@FindBy(xpath="//a[.='Career Info']")
	private WebElement careerbtn;
	public FollowCareer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void signin()
	{
		signinbttn.click();
	}public void email(String emailId)

	{
		emailtb.sendKeys(emailId);
	}
	public void password(String pswd)
	{
		pwdtb.sendKeys(pswd);
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
	public void more(Actions  a ) throws InterruptedException{
		a.moveToElement(morebtn).perform();
		Thread.sleep(5000);
		careerbtn.click();
	}
}


