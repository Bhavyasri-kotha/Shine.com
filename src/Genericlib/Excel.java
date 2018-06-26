package Genericlib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Excel implements Constant{
public  static String excelsheet(String path,String sheet,int r,int c){
	String s="";
	try{
		FileInputStream f=new FileInputStream(path);
		Workbook w= WorkbookFactory.create(f);
		 s=w.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
	}
	catch(Exception e){
		Reporter.log("fail");
	}
	return s;
}
public static void main(String[] args) {
	String d = excelsheet(EXCEL_PATH,"Sheet1", 0, 0);
	System.out.println(d);
}

}
