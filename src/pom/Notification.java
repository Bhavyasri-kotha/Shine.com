package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlib.BasePage;

public class Notification {
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
    
	@FindBy(xpath="//span[@class='notify_bell']")
	private WebElement notifybtn;
	@FindBy(xpath="//span[@class='spanName']")
	private WebElement namebtn;
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement signoutbtn;
	//@FindBy(xpath="//strong[.='Recent Search']")
	//private WebElement namebtn;
	//@FindBy(xpath="//a[.='Sign out']")
//	private WebElement signoutbtn;
//	@FindBy(xpath="//strong[.='Recruiter Activity']")
	//private WebElement recruiterbtn;
	public Notification(WebDriver driver)
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
	
	public void notificate(WebDriver driver)
	{
		BasePage.visibility(notifybtn, driver);
		notifybtn.click();
	}
	public void name(Actions a ) throws InterruptedException{
		a.moveToElement(namebtn).perform();
		Thread.sleep(5000);
		signoutbtn.click();
	}
}	
/* public void recruiterActivity(){
	recruiterbtn.click();
}
	
public void notification(Actions  a ) throws InterruptedException{
		a.doubleClick(notifybtn).perform();
		
	}
	
	
		
	/*public void name(Actions  a ) throws InterruptedException{
		a.moveToElement(namebtn).perform();
		Thread.sleep(5000);
		signoutbtn.click();
	}*/
	
		
