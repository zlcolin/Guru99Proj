package Guru99Pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelclass {
	FileInputStream fis;
	Workbook wb;
	Sheet sh;
	Row rw;
	Cell cell1;
	String cellval1;
	Cell cell2;
	String cellval2;
	Row writerw;
	Cell writecell;
	
	
	//Constructor
	// added comment
	public Excelclass(String filepath, String sheetname) throws Exception{
		try {
			fis=new FileInputStream(filepath);
			wb=WorkbookFactory.create(fis);
			sh=wb.getSheet(sheetname);
					
			} catch (Exception e){
				throw (e);
			}
	}
	
	
	public String getRowID(int rowno,int idcell) throws Exception {			
			
	try {
	rw=sh.getRow(rowno);
	cell1=rw.getCell(idcell);
	cellval1=cell1.getStringCellValue();
	
	} catch (Exception e){
		throw (e);
	}
	return cellval1;
	}
	
	public String getRowPass(int rowno,int idpass ) throws Exception {
	
	try {
		rw=sh.getRow(rowno);
		cell2=rw.getCell(idpass);
		cellval2=cell2.getStringCellValue();
	} catch (Exception e){
		throw (e);
	}
	return cellval2;			
	}
	
	public  void setResult(int rowno,int cellno, String message ) throws Exception {
		
		try {
			writerw=sh.getRow(rowno);	
			writecell=writerw.createCell(cellno);
			writecell.setCellType(Cell.CELL_TYPE_STRING);
			writecell.setCellValue(message);
			FileOutputStream fos=new FileOutputStream("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\TestData.xls");
			wb.write(fos);
			fos.close();
		} catch (Exception e){
			throw (e);
		}
			
		}
	
}
