package ThreadPatterns.demo1;

public class App3 {

    public static void main(String args[])
    {
        Thread t1 = new Thread(new Runner()
        {
            public void run()
            {
                for(int i=0; i < 10 ; i++){
                    System.out.println(i);
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}