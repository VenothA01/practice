package templatePattern;

public class TestTemplate {

    public static void main(String args[])
    {
        ExcelFile obj = new ExcelFile();
        obj.readData();
        obj.PrccessData();
        obj.saveData();

        TextFile obj1 = new TextFile();
        obj1.readData();
        obj1.PrccessData();
        obj1.saveData();
    }
}
