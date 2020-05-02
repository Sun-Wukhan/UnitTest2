package internalexternal;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadTestDataXLSXFile {



        protected XSSFSheet excelWSheet;
        protected XSSFWorkbook excelWBook;
        protected XSSFCell cell;
        protected XSSFRow row;


        public void setExcelFile(String Path) throws IOException {
          //  FileInputStream in = null;
            System.out.println( getClass().getClassLoader().getResource(""));
           ;
            try {
             //   in = new FileInputStream("/Users/navid/Documents/JavaModuleTest/modul_02_java_test_b2001/module_02_test/data/testData.xlsx");
                excelWBook = new XSSFWorkbook(getClass().getClassLoader().getResourceAsStream(""));
                excelWSheet = excelWBook.getSheetAt(0);
                for (int i = 0; i < excelWSheet.getPhysicalNumberOfRows(); i++) {
                    row = excelWSheet.getRow(i);
                    for (int j = 0; j < row.getLastCellNum(); j++)
                        System.out.println(row.getCell(j));
                }

            } catch (Exception e) {
               e.printStackTrace();
            }

            }


        public static void main(String[] args) throws IOException {
          ReadTestDataXLSXFile f = new ReadTestDataXLSXFile();
          f.setExcelFile("");
            System.out.println(System.getProperty("user.dir"));



    }
}


