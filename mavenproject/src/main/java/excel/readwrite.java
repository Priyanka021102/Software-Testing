package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readwrite {
	
	//xls:HSSF
	//xlsx:XSSF
	
	//READ
	@Test
	public void testcase() throws IOException {
		File obj1=new File("C:\\Users\\Priyanka\\Downloads\\SPD .xlsx");
		FileInputStream obj2=new FileInputStream(obj1);
		XSSFWorkbook obj3=new XSSFWorkbook(obj2);
		XSSFSheet var1=obj3.getSheetAt(0);
		
		//count no.of rows
		int var2=var1.getLastRowNum();
		System.out.println("Total Number of Rows:"+var2);
		
		//count no.of columns
		int var3=var1.getRow(4).getLastCellNum();
		System.out.println("Total Number of Columns:"+var3);
		
		//specific value in sheet
		XSSFCell var4=var1.getRow(4).getCell(2);
		System.out.println(var4);
		
		//WRITE
		var1.getRow(2).createCell(4).setCellValue("*****");
		FileOutputStream fos=new FileOutputStream(obj1);
		obj3.write(fos);
	}
	

}
