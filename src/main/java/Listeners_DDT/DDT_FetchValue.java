package Listeners_DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDT_FetchValue 
{
	public static String user_name;
	public static String pass_word;
public void Data_fetching() throws EncryptedDocumentException, IOException
{
		
		FileInputStream f1=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Basic\\TestData\\Deepika.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		user_name=NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(3).getNumericCellValue());
		pass_word=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	}
}
