package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ForgotPasswordPage {
	public WebDriver driver;
    //Declaration
	@FindBy(xpath="//div[@class='up']")
	private WebElement signinbttn;
	@FindBy(id="id_email_login")
	private WebElement emailtb;
	@FindBy(xpath="//a[.='Forgot Password']")
	private WebElement forgotbtn;
	@FindBy(xpath="//input[@id='candidateemailid']")
	private WebElement mailtb;
	@FindBy(xpath="//button[@id='id_fpSubmit']")
	private WebElement submitbtn;
	@FindBy(xpath="//span[.='close']")
	private WebElement closebtn;
	public ForgotPasswordPage(WebDriver driver)
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
	public void forgotPassword(){
	forgotbtn.click();
	}
	public void mail(String ma){
		mailtb.sendKeys(ma);
	}
	public void submit(){
		submitbtn.click();
}
	public void close(){
		closebtn.click();
	}
}