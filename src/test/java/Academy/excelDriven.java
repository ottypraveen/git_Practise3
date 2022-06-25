package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDriven {
	
	
	public ArrayList<String> getDataFromExcel(String testCase) throws IOException
	{
		
		ArrayList<String> a=new ArrayList<>();
		FileInputStream fisexcel=new FileInputStream("C:\\Users\\User\\FrameWorkNew\\E2E_Selenium_Practise\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fisexcel);
		int worksheets=workbook.getNumberOfFonts();
		for(int i=0;i<worksheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				XSSFSheet worksheet=workbook.getSheetAt(i);
				Iterator<Row> rows=worksheet.rowIterator();
				Row firstRow=rows.next();
				Iterator<Cell> cell=firstRow.cellIterator();
				int k=0;
				int column=0;
				
				while(cell.hasNext())
				{
					Cell firstCell=cell.next();
					if(firstCell.getStringCellValue().equalsIgnoreCase("TestCase"))
					{
						column=k;
					}
				}
				
				
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCase))
					{
						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext())
						{
							
							a.add(cv.next().getStringCellValue());
						}
					}
				}
				
			}
			
			
		}
		return a;
		
	}

}
