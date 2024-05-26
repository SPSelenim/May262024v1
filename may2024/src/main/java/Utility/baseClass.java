package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class baseClass {

	public void readProperties()
	{
		try
		{
			File f=new File(System.getProperty("user.dir")+"//src//main//java//Resources//my.properties");
			System.out.println(System.getProperty("user.dir"));
			FileInputStream fis=new FileInputStream(f);
			Properties p=new Properties();
			p.load(fis);
			System.out.println("USERNAME : "+p.getProperty("UserName"));
			System.out.println("PASSWORD" + p.getProperty("Password"));
			System.out.println("URL " +p.getProperty("URL"));
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void readExel()
	{
		try
		{
			File f=new File(System.getProperty("user.dir")+"//src//main//java//Resources//Book1.xlsx");
			System.out.println(System.getProperty("user.dir"));
			FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh1 = wb.getSheet("Sheet1");
		Short c = sh1.getRow(0).getLastCellNum();	
	int r=sh1.getLastRowNum();
		for (int rr=0;rr<r+1;rr++)
		{
			for (int c1=0;c1<c;c1++ )
			{
				String myData = sh1.getRow(rr).getCell(c1).getStringCellValue();
			System.out.println(myData);
			}
		}
		wb.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
