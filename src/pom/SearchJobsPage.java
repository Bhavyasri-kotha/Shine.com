package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchJobsPage {

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
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	private WebElement searchbtn;
	@FindBy(xpath="//div[@id='id_searchBase']")
	private WebElement searchtb;
	@FindBy(id="id_q")
	private WebElement titletb;
	@FindBy(id="id_loc")
	private WebElement locationtb;
	@FindBy(id="id_minexp")
private WebElement exper;
	@FindBy(xpath="//input[@value='Search jobs']")
	private  WebElement jobsbtn;
	public SearchJobsPage(WebDriver driver)
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
	public void search(Actions  a ) throws InterruptedException{
		a.moveToElement(searchbtn).perform();
		Thread.sleep(5000);
		searchtb.click();
	}
/*public void title(Actions  a ) throws InterruptedException{
		a.moveToElement(titletb).perform();
		Thread.sleep(5000);
		locationtb.click();
	}*/
	public void title(String name){
		titletb.sendKeys(name);
	}
	public void location(String city){
		locationtb.sendKeys(city);
		
	}
	public void selectDrop(int i){
		Select s=new Select(exper);
		s.selectByIndex(2);
}
    public void searchJobs(){
	jobsbtn.click();
}
}	
	

