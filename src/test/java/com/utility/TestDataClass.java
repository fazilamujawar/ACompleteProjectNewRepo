package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.baseClass.DriverSetup;

public class TestDataClass extends DriverSetup {

	public String getDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		{
			FileInputStream file=new FileInputStream("D:\\Soft stuff\\NewProjectTCData.xlsx");
			String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
			return data;
		}
	}
}
