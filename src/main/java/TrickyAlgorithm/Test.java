package TrickyAlgorithm;

public class Test {

    private static int x = 10 ; ;
    private static int y = 10 ;

    private Test()
    {
        this(5);
    }
    private Test(int x)
    {
        this(x,y);
    }

    private Test(int x,int y)
    {
        System.out.println(x*y);
    }

    public final static void main(String args[])
    {
        Test t = new Test();
    }
}
