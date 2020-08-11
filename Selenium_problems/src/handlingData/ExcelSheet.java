package handlingData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelSheet {

	public static void main(String[] args) throws Exception, IOException {
		FileInputStream fis = new FileInputStream("./data/facebookdata.xlsx");
		//creating this page for excel sheet
		Workbook w = WorkbookFactory.create(fis);
		 Sheet s = w.getSheet("subhash");
		 System.out.println(s.getLastRowNum());
		 for(int i=0;i<=s.getLastRowNum();i++)
		 {
		 Row r = s.getRow(i);
		// System.out.println(r.getLastCellNum());
		 for(int j=0;j<r.getLastCellNum();j++)
		 {
		 Cell c = r.getCell(j);
		 System.out.print(c.toString()+"||");
		 }
		 System.out.println("");
	}
	}
	}
/*	@Test
	public void readXLdata() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook w = WorkbookFactory.create(new FileInputStream("./data/subhash facebook.xlsx"));
		System.out.println(w.getSheet("Sheet1").getRow(5).getCell(3).toString());
		
	}*/
	/*@Test
	public void writeXLData() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wk = WorkbookFactory.create(new FileInputStream("./data/data.xlsx"));
		Sheet sh = wk.getSheet("Dummy");
		Row r=null;
		    if(sh!=null)
		    {
		    	r=sh.getRow(25);
		    }

		    if(r==null)
		    {
		    	r=sh.createRow(25);
		    }
		    Cell c = r.getCell(10);
		         if(c==null)
		         {
		        	 c=r.createCell(10);
		         }
		    c.setCellValue("dummy students");	
		FileOutputStream fos=new FileOutputStream("./data/data.xlsx");
		wk.write(fos);
		fos.close();
		wk.close();
	
	
	
		
	
	@Test
	public void writeXLdata() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook w = WorkbookFactory.create(new FileInputStream("./data/Gadde Mounika_Manual_Testing_Project.xlsx"));
		 Sheet sh = w.getSheet("References");
		Row r = null;
		if(sh!=null)
		{
			r=sh.getRow(3);
		}
		if(r==null)
		{
			sh.createRow(3);
		}
		Cell c = r.getCell(0);
        if(c==null)
        {
          c = r.createCell(0);
        }
        c.setCellValue("subhash");
        FileOutputStream fos =  new FileOutputStream("./data/Gadde Mounika_Manual_Testing_Project.xlsx");
        		w.write(fos);
        		w.close();
        		fos.close();
}
}*/