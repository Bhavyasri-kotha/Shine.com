package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Genericlib.Base_Test;
import Genericlib.Excel;
import pom.JobAlertProfile;
import pom.LoginPage;

public class JobAlertOutput extends Base_Test {

	@Test
	public void test() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(5000);
		lp.signin();
		Thread.sleep(5000);
		String us=Excel.excelsheet(EXCEL_PATH,"Sheet1",1,0);
		String psd=Excel.excelsheet(EXCEL_PATH,"Sheet1",2,0);
        lp.email(us);
		Thread.sleep(5000);
		lp.password (psd);
		Thread.sleep(1000);
		lp.clicklogin();
		Thread.sleep(1000);
		JobAlertProfile jp=new JobAlertProfile(driver);
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		jp.more1(a);
		Thread.sleep(1000);
		jp.jobalert();
		Thread.sleep(1000);
		jp.add();
		Thread.sleep(1000);
		jp.alertName(Excel.excelsheet(EXCEL_PATH,"Sheet1",5,0));
		Thread.sleep(1000);	
		jp.mail(Excel.excelsheet(EXCEL_PATH,"Sheet1",1,0));
		Thread.sleep(1000);
		jp.keywords(Excel.excelsheet(EXCEL_PATH,"Sheet1",3,0));
		Thread.sleep(1000);
		jp.keywords(a);
		Thread.sleep(1000);
		jp.selectDrop(2);
		Thread.sleep(1000);
		jp.selectDrop1(2);
		Thread.sleep(1000);
		jp.selectDrop2(2);
		jp.selectDrop3(2);
		Thread.sleep(1000);
		jp.createAlert();
		}
}