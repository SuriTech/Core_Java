package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream("D:\\SUREN\\Common\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh=wb.getSheetAt(0);
		
		Row row1=sh.getRow(0);
		Cell cell1=row1.getCell(0);
		
		System.out.println(sh.getRow(0).getCell(0));
		System.out.println(sh.getRow(0).getCell(1));
		System.out.println(sh.getRow(0).getCell(2));

		System.out.println(sh.getRow(1).getCell(0));
		System.out.println(sh.getRow(1).getCell(1));

		int rcount=sh.getLastRowNum()-sh.getFirstRowNum();
		
		for (int i=0; i<rcount+1; i++)
		{
			Row row=sh.getRow(i);
			for(int j=0; j<row.getLastCellNum(); j++)
				System.out.println(row.getCell(j).getStringCellValue());
			
		}
			
				
				
				
	
		
		/*	
		int rcount=sh.getLastRowNum()-sh.getFirstRowNum();
		
	for (int i=0; i<rcount+1;i++)
	{
		Row row=sh.getRow(i);
		for(int j=0; j<row.getLastCellNum(); j++)
		{
		System.out.print(row.getCell(j).getStringCellValue()+ "---");
		}	
		System.out.println();
	
	}
	*/				}

}
