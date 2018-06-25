package pom;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class JobAlertProfile {
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
	@FindBy(xpath="//a[.='My Job Alerts']")
	private WebElement myjobbtn;
	//@FindBy(xpath="//a[@class='dropdown-toggle active']")
	//private WebElement profilebtn;
	@FindBy(xpath="//a[.='Create new job alert']")
	private WebElement alertbtn; 
	@FindBy(name="name")
	private WebElement alertnametb;
	@FindBy(id="id_mail")
	private WebElement mailtb;
	@FindBy(id="id_keywords")
	private WebElement keytb;
	@FindBy(xpath="//a[.='Add more detail']")
	private WebElement addbtn;	
	@FindBy(name="sal")
	private WebElement salbtn;
	@FindBy(name="exp")
	private WebElement expebtn;
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement locabtn;
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement deparbtn;
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement indusbtn;
	@FindBy(xpath="//a[.='Create my job alert']")
	private WebElement createbtn;
	public JobAlertProfile(WebDriver driver)
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
	/*public void profile()
	{
		profilebtn.click();
	}
	/*public void myProfile()
	{
		myprofilebtn.click();
	}*/
	public void more1(Actions  a) throws InterruptedException{
		a.moveToElement(morebtn).perform();
		Thread.sleep(5000);
		myjobbtn.click();
	}public void jobalert()
	{
		alertbtn.click();
	}
	public void add()
	{
		addbtn.click();
	}
	public void alertName(String aname){
		alertnametb.sendKeys(aname);
	}
	public void mail(String name){
		mailtb.sendKeys(name);
	}
	public void keywords(String name){
		keytb.sendKeys(name);
	}
	public void keywords(Actions  a ) throws InterruptedException{
		a.moveToElement(keytb).perform();
		Thread.sleep(5000);
		salbtn.click();
	}
	public void selectDrop(int i){
		Select s=new Select(salbtn);
		s.selectByIndex(2);
	}
		public void selectDrop1(int i){
		Select s1=new Select(expebtn);
		s1.selectByIndex(2);
		}
		public void selectDrop2(int i){
		Select s2=new Select(locabtn);
		s2.selectByIndex(2);
		}
		public void selectDrop3(int i){
		Select s3=new Select(deparbtn);
		s3.selectByIndex(2);
		}
  public void createAlert(){
		createbtn.click();
	}
	public void more(Actions  a ) throws InterruptedException{
		a.moveToElement(morebtn).perform();
		Thread.sleep(5000);
		myjobbtn.click();

	}
}