package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BlankCellReadTestInExcel {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Vmetry\\LearnJava\\File\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook workBook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workBook.getSheet("Home");
		
		int row=sheet.getLastRowNum()+1;
		int col=sheet.getRow(0).getLastCellNum();
		
		System.out.println(row);
		System.out.println(col);
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				
				
				if(sheet.getRow(i).getCell(j)!=null){ //Here First thing we need to check Null Value and write the remaining code in else if.//
													//If same code is written in the else if part it will throw Null pointer Exception. Empty 
				if(sheet.getRow(i).getCell(j).getCellType()== Cell.CELL_TYPE_STRING)// This line for allowing string value from excel sheet to console.
				{
				String dataval=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(dataval+ " ");
				}
				else if(sheet.getRow(i).getCell(j).getCellType()== Cell.CELL_TYPE_NUMERIC)
				{
				int dataval=(int) sheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(dataval+ " ");
				}
				}
				
				
				else{
				System.out.print("blank"+ "	 ");
				}
				
			}
			System.out.println();			
		   }
		
		
	}

}
