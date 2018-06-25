package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UpdateSkillsPage {
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
	@FindBy(xpath="//a[@href='/myshine/myprofile/']")
	private WebElement profilebtn;
	@FindBy(xpath="//a[.='My Profile']")
	private WebElement myprofilebtn;
	@FindBy(xpath="//a[.='Add skill']")
	private WebElement addbtn;
	@FindBy(name="value")
	private WebElement skilltb;
	@FindBy(id="id_years_of_experience")
	private WebElement exp;
	@FindBy(xpath="//input[@class='submitred']")
    private WebElement savebtn;
	public UpdateSkillsPage(WebDriver driver)
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
	public void profile(Actions  a ) throws InterruptedException{
		a.moveToElement(profilebtn).perform();
		myprofilebtn.click();
	}
	public void myprofile(Actions  a ) throws InterruptedException{
		a.moveToElement(myprofilebtn).perform();
		addbtn.click();
	}
	public void skills(String name ){
	skilltb.sendKeys(name);
	}
	public void selectDrop(int i){
		Select s=new Select(exp);
		s.selectByIndex(2);
		
} 
	public void save(){
		savebtn.click();
	}
	}
	


