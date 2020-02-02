package misc;

interface  A
{
    int a = 10 ;


    void  display();
}


class B implements  A{

    public void  display()
    {
        System.out.println("Displayed");
    }
}

public class Test {

    public static void main(String args[])
    {
        A b = new B();
        b.display();
    }
}
