package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Genericlib.Base_Test;
import Genericlib.Excel;
import pom.BlockRecruiterPage;
import pom.LoginPage;

public class BlockRecruiterTest extends Base_Test {

			@Test
			public void test() throws InterruptedException
			{
				LoginPage lp=new LoginPage(driver);
				Thread.sleep(5000);
				lp.signin();
				Thread.sleep(6000);
				String us=Excel.excelsheet(EXCEL_PATH,"Sheet1",1,0);
				String psd=Excel.excelsheet(EXCEL_PATH,"Sheet1",2,0);
				Thread.sleep(6000);
		        lp.email(us);
				Thread.sleep(5000);
				lp.password (psd);
				Thread.sleep(5000);
				lp.clicklogin();
				BlockRecruiterPage bj=new BlockRecruiterPage(driver);
				Thread.sleep(5000);
				Actions a=new Actions(driver);
				bj.name(a);
				bj.ename(a);
			}
}