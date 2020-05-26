package test;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class AddJobTitle extends ExcelDataConfig {

    public AddJobTitle () {
        super("src/test/resources/ExcelSheet/Login.xlsx");
    }



    @DataProvider(name = "AddJobTitleTest")
    public Object[][] AddJobTitleTest() {

        int rows = getRowCount("AddJobTitle");
        int col = getColumnCount("AddJobTitle");

        //  LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddJobTitle", i, j);
            }
        }
        return data;
    }

}
