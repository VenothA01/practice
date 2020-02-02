package ThreadPatterns.demo1.ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements  Runnable{

    private   int id ;

    public Processor(int id)
    {
        this.id = id ;
    }

    public void run()
    {
        System.out.println("Starting and the Id is "+id);

        try {
            Thread.sleep(5000)   ;
        }
        catch (InterruptedException iE)
        {
            iE.printStackTrace();
        }

        System.out.println("Completed ::"+id);
    }
}
public class App {

    public static void main(String args[])
    {

        ExecutorService service = Executors.newFixedThreadPool(2);

        for(int i = 0 ; i < 5 ; i++)
        {
            service.submit(new Processor(1));
        }

        service.shutdown();

        System.out.println("All tasks submitted");

        try {
            service.awaitTermination(1, TimeUnit.HOURS);
        }
        catch (InterruptedException iE)
        {
            iE.printStackTrace();
        }

        System.out.println("All tasks completed");
    }
}
