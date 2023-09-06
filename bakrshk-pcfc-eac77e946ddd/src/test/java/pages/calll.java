package pages;

import Helper.CellValues;
import Helper.DataRead;
import Helper.Xls_Reader;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calll {

    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir");
        String rel = path + "\\src\\test\\java\\TestData\\Test.xlsx";
//        Xls_Reader x = new Xls_Reader("Z:\\Projects\\Cucumber_framework\\src\\test\\java\\TestData\\Test.xlsx");
        Xls_Reader y = new Xls_Reader(rel);
        String Ref = "hello";
        y.setCellData1("Sheet1",3,3,Ref);


    }
}