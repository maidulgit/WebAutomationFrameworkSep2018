package dataProviderUtilityWIthXlsReader;

import java.util.ArrayList;

public class XlsDataReaderUtil {

    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            reader = new Xls_Reader("C:\\Users\\himel\\IdeaProjects\\WebAutomationDemo\\Amazon\\data\\itemlist.xls");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // change only sheet name in line 19
        for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
            String  items = reader.getCellData("Sheet1", "Items",rowNum );
            /*String passCode = reader.getCellData("Sheet1","passCode", rowNum);
            String message = reader.getCellData("Sheet1","message", rowNum);*/
            Object obj[] = {items}; // ,passCode, message};
            myData.add(obj);
        }

        return  myData;
    }
}
