package pom;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
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
    
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void signin()
	{
		 signinbttn.click();
	}
	public void email(String emailId)
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
	
	
	
	}
