package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BlockRecruiterPage {
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
	@FindBy(xpath="//span[@class='spanName']")
	private WebElement namebtn;
	@FindBy(xpath="//a[.='Account Settings']")
	private WebElement accountbtn;
	@FindBy(xpath="//span[@class='spanName']")
	private WebElement enamebtn;
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement signoutbtn;
	
    public BlockRecruiterPage(WebDriver driver)
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
	public void name(Actions a ) throws InterruptedException{
		a.moveToElement(namebtn).perform();
		Thread.sleep(5000);
		accountbtn.click();
	}
	public void ename(Actions a ) throws InterruptedException{
		a.moveToElement(namebtn).perform();
		Thread.sleep(5000);
		signoutbtn.click();
	}
}



















