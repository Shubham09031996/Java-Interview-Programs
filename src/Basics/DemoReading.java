package Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoReading {

    public static void main(String[] args) {
        String path = "C:\\Users\\Shubham\\OneDrive\\Documents\\Employee.xlsx";

        try (FileInputStream fis = new FileInputStream(path);
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {

            System.out.println("Excel file opened successfully!");

            // You can access sheets like this
            System.out.println("Sheet count: " + wb.getNumberOfSheets());
            System.out.println("First sheet name: " + wb.getSheetAt(0).getSheetName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
