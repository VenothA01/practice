package ThreadPatterns.demo1.Synchronization2;

public class App {

    private  int  count = 0 ;

    public synchronized void incr()
    {
        count ++ ;
    }

    public  static void main(String args[])
    {
        App app =  new App();
        app.doWork();
    }


    public void doWork()
    {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i=0 ; i<500000; i++)
                {
                   incr();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i=0 ; i<500000; i++)
                {
                   incr();
                }
            }
        });

        t1.start();
        t2.start();

        try
        {
            t1.join();
        }
        catch (InterruptedException iE)
        {
            iE.printStackTrace();
        }
        try
        {
            t2.join();
        }
        catch (InterruptedException iE)
        {
            iE.printStackTrace();
        }

        System.out.println("count is "+count);
    }
}
