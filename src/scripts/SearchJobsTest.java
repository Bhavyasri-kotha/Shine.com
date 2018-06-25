package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Genericlib.Base_Test;
import Genericlib.Excel;
import pom.LoginPage;
import pom.SearchJobsPage;

public class SearchJobsTest extends Base_Test {

	@Test
	public void test() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(5000);
		lp.signin();
		Thread.sleep(5000);
		String us=Excel.excelsheet(EXCEL_PATH,"Sheet1",1,0);
		String psd=Excel.excelsheet(EXCEL_PATH,"Sheet1",2,0);
		String tit=Excel.excelsheet(EXCEL_PATH,"Sheet1",3,0);
		String loc=Excel.excelsheet(EXCEL_PATH,"Sheet1",4,0);
        lp.email(us);
		Thread.sleep(5000);
		lp.password (psd);
		Thread.sleep(1000);
		lp.clicklogin();
		Thread.sleep(1000);
		 SearchJobsPage sj=new SearchJobsPage(driver);
		 Thread.sleep(1000);
		 Actions a=new Actions(driver);
		 sj.search(a);
		 Thread.sleep(1000);
		 sj.title(tit);
		 sj.location(loc);
		 sj.selectDrop(2);
		 sj.searchJobs();
	}

}
