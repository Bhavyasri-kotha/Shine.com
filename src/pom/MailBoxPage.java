package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class MailBoxPage {
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
	@FindBy(xpath="//a[.='Mailbox']")
	private WebElement mailbtn;
	/*@FindBy(xpath="//a[@class='active']")
	private WebElement alertbtn;
	@FindBy(xpath="(//span[@class='snd'])[1]")
	private WebElement job1;
	@FindBy(xpath="//span[contains(.,'JH ')]")
	private WebElement detailsbtn;*/
	@FindBy(xpath="//span[@class='spanName']")
	private WebElement namebtn;
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement signoutbtn;
	public MailBoxPage(WebDriver driver)
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
	public void mail(WebDriver driver)
	{	
		BasePage.visibility(mailbtn, driver);
		mailbtn.click();
	}
	/*public void alert()
	{
		alertbtn.click();
	}
	public void job()
	{
		job1.click();
	}
	public void jobDetails()
	{
		detailsbtn.click();
	}*/
	public void name(Actions a ) throws InterruptedException{
		a.moveToElement(namebtn).perform();
		Thread.sleep(5000);
		signoutbtn.click();
	}
	}


