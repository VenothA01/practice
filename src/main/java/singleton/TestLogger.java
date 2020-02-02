package singleton;

public class TestLogger {

    public static void main(String args[])
    {
        Logger logObj1 = Logger.getInstance();
        Logger logObj2 = Logger.getInstance();

        System.out.println("logObj1::"+logObj1.hashCode());
        System.out.println("logObj2::"+logObj2.hashCode());
    }
}
