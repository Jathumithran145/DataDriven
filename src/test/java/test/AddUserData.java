package test;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class AddUserData extends ExcelDataConfig {

    public AddUserData () {
        super("src/test/resources/ExcelSheet/Login.xlsx");
    }
    @DataProvider(name = "AddUserTestData")
    public Object[][] AddUserTestData() {

        int rows = getRowCount("AddUser");
        int col = getColumnCount("AddUser");

        //  LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddUser", i, j);
            }
        }
        return data;
    }
}
