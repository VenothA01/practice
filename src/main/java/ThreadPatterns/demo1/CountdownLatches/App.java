package ThreadPatterns.demo1.CountdownLatches;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {


    static class Processor implements Runnable
    {
        private CountDownLatch latch ;

        public Processor(CountDownLatch latch)
        {
            this.latch = latch ;
        }
        public void run()
        {
            System.out.println( "Started");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            latch.countDown();
        }
    }

    public static void main(String args[])
    {
        CountDownLatch latch = new CountDownLatch(3);

        ExecutorService service = Executors.newFixedThreadPool(3);

        for(int i=0 ; i < 3 ; i++)
        {
            service.submit(new Processor(latch)) ;
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed");

    }
}
