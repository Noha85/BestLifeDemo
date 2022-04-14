package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib  {

	
	@DataProvider(name = "ValidateCDCODE")
	public static Object[][] loginData() throws IOException {
		Object[][] arrayObject = getExcelData(
				
				"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
				"ValidateCDCODE");
		return arrayObject;
	}

	@DataProvider(name = "SearchforPlan")
	public static Object[][] getplan() throws IOException {
		Object[][] arrayObject = getExcelData(
				"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
				"SearchforPlan");
		return arrayObject;
	}

	@DataProvider(name = "Mandatory")
	public static Object[][] getmandatory() throws IOException {
		Object[][] arrayObject = getExcelData(
				"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
				"Mandatory");
		return arrayObject;
	}

	@DataProvider(name = "Clear&Cancel")
	public static Object[][] getClearnCancel() throws IOException {
		Object[][] arrayObject = getExcelData(
				"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
				"Clear&Cancel");
		return arrayObject;
	}
	
	@DataProvider(name = "Add")
	public static Object[][] gethappyscenario() throws IOException {
		Object[][] arrayObject = getExcelData(
				"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
				"Add");
		return arrayObject;
	}
	
	@DataProvider(name = "AddCC")
	public static Object[][] AddCustCase() throws IOException {
		Object[][] arrayObject = getExcelData(
				"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
				"AddCC");
		return arrayObject;
	}
	
	@DataProvider(name = "AddPM")
	public static Object[][] AddPrimaryMember1() throws IOException {
		Object[][] arrayObject = getExcelData(
				"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
				"AddPM");
		return arrayObject;
	}
	
	@DataProvider(name = "AddPrimaryMember")
	public static Object[][] AddPrimaryMember() throws IOException {
		Object[][] arrayObject = getExcelData(
				"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
				"AddPrimaryMember");
		return arrayObject;
	}
	@DataProvider(name = "CreateCustomer")
	public static Object[][] CreateCustomer() throws IOException {
		Object[][] arrayObject = getExcelData(
				"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
				"CreateCustomer");
		return arrayObject;
	}
		
		@DataProvider(name = "Publish")
		public static Object[][] publishcheckbox() throws IOException {
			Object[][] arrayObject = getExcelData(
					"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
					"Publish");
			return arrayObject;
	}
	
		@DataProvider(name = "AddDependent")
		public static Object[][] AddDependent() throws IOException {
			Object[][] arrayObject = getExcelData(
					"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
					"AddDependent");
			return arrayObject;
		}
		
		@DataProvider(name = "AddDependentCase")
		public static Object[][] AddDependentCase() throws IOException {
			Object[][] arrayObject = getExcelData(
					"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
					"AddDependentCase");
			return arrayObject;
		}
		
		@DataProvider(name = "AddDependentAndCase")
		public static Object[][] AddDependentAndCase() throws IOException {
			Object[][] arrayObject = getExcelData(
					"D:\\git\\HIASAuto\\BESTDDFinalVersion2\\src\\test\\java\\testdata\\TestData.xlsx",
					"AddDependentAndCase");
			return arrayObject;
		}
/*	
	//ConCat 2 or 3 data provider Function
	@DataProvider(name = "objectCodes")
    public static Object[][] getObjectCodes() throws IOException{
        return combine(loginData(),  getplan());
    }
	  public static Object[][] combine(Object[][] a1, Object[][] a2){
	        List<Object[]> objectCodesList = new LinkedList<Object[]>();
	        for(Object[] o : a1){
	            for(Object[] o2 : a2){
	            	objectCodesList.add(concatAll(o, o2));
	            }
	        }
	         return objectCodesList.toArray(new Object[0][0]);
	    
	    }
	  
	  public static <T> T[] concatAll(T[] first, T[]... rest) {
		     //calculate the total length of the final object array after the concat    
		      int totalLength = first.length;
		      for (T[] array : rest) {
		        totalLength += array.length;
		      }
		      //copy the first array to result array and then copy each array completely to result
		      T[] result = Arrays.copyOf(first, totalLength);
		      int offset = first.length;
		      for (T[] array : rest) {
		        System.arraycopy(array, 0, result, offset, array.length);
		        offset += array.length;
		      }

		      return result;
		    }
*/
	public static String[][] getExcelData(String fileName, String sheetName) throws IOException {

		FileInputStream fs = new FileInputStream(fileName);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheet(sheetName);
		
		int totalNoOfCols = sh.getRow(0).getLastCellNum();
		int totalNoOfRows = sh.getLastRowNum()+1;
		String[][] data = new String[(totalNoOfRows - 1)][totalNoOfCols];
		// Loop through all rows in the sheet
		// Start at row 1 as row 0 is our header row
		int k = 0;
		for (int i = 1; i <= totalNoOfRows -1 ; i++) {
			XSSFRow row = sh.getRow(i);
			for (int j = 0; j < totalNoOfCols; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cellToString(cell);
				data[k][j] = value;
			}
			k++;
		}
		
		return data;
		
		

	}

	@SuppressWarnings("deprecation")
	public static String cellToString(XSSFCell cell) {
		// TODO Auto-generated method stub
		Object result;
		switch (cell.getCellType()) {

		case Cell.CELL_TYPE_NUMERIC:
			result = cell.getNumericCellValue();
			break;

		case Cell.CELL_TYPE_STRING:
			result = cell.getStringCellValue();
			break;

		case Cell.CELL_TYPE_BOOLEAN:
			result = cell.getBooleanCellValue();
			break;

		case Cell.CELL_TYPE_FORMULA:
			result = cell.getCellFormula();
			break;

		default:
			throw new RuntimeException("Unknown Cell Type");
		}

		return result.toString();
	}


}
