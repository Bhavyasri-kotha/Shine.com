package scripts;
import org.testng.annotations.Test;
import Genericlib.Base_Test;
import Genericlib.Excel;
import pom.ForgotPasswordPage;
import pom.LoginPage;
public class ForgotPasswordTest extends Base_Test {
	@Test
	public void test() throws InterruptedException{
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(5000);
		lp.signin();
		Thread.sleep(5000);
		String us=Excel.excelsheet(EXCEL_PATH,"Sheet1",1,0);
		//String psd=Excel.excelsheet(epath,"sheet1",1,0);
		lp.email(us);
		Thread.sleep(5000);
		ForgotPasswordPage fp=new ForgotPasswordPage(driver);
		Thread.sleep(5000);
		fp.forgotPassword();
		Thread.sleep(5000);
		fp.mail(us);
		Thread.sleep(5000);
		fp.submit();
		Thread.sleep(5000);
		fp.close();
     }
}