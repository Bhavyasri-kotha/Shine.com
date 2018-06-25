package scripts;
import org.testng.annotations.Test;
import Genericlib.Base_Test;
import Genericlib.Constant;
import Genericlib.Excel;
import pom.LoginPage;
public class LoginTest extends Base_Test implements Constant {
	@Test
	public void test() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(5000);
		
		lp.signin();
		String us=Excel.excelsheet(EXCEL_PATH,"Sheet1",1,0);
		String psd=Excel.excelsheet(EXCEL_PATH,"Sheet1",2,0);
		Thread.sleep(5000);
		lp.email(us);
		Thread.sleep(5000);
		lp.password (psd);
		Thread.sleep(1000);
		lp.clicklogin();
	}
}
