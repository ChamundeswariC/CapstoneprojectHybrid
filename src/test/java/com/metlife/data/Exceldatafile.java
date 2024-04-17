package com.metlife.data;
import com.metlife.utilities.ExcelUtils;
import org.testng.annotations.DataProvider;




public class Exceldatafile {
    @DataProvider
    public Object[][] ExcelData(){
//        return new Object[][]{
//                new Object[]{"Jaipur","Chennai","Apr 2024"}
//        };
        return ExcelUtils.readExcel();



    }
}


