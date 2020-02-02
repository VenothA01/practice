package ThreadPatterns.demo1.SynchronizedCodeBlocks;

import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

    private List<Integer> list1 = new ArrayList<Integer>();
    private List<Integer> list2 = new ArrayList<Integer>();
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();


    public void stageOne()
    {
        synchronized (lock1)
        {
            try
            {
                Thread.sleep(1);
                list1.add(random.nextInt(100)) ;
            }
            catch (InterruptedException iE)
            {
                iE.printStackTrace();
            }
        }

    }

    public  void stageTwo()
    {
        synchronized (lock2)
        {
            try {
                Thread.sleep(1);
                list2.add(random.nextInt(100));
            } catch (InterruptedException iE) {
                iE.printStackTrace();
            }
        }

    }

    public  void process()
    {
        for(int i=0; i<1000 ; i++)
        {
                stageOne();
                stageTwo();
        }
    }

    public void main()
    {
        System.out.println("Starting to Process");

        long start = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                process();
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


        long end   = System.currentTimeMillis();

        System.out.println("Time taken to process "+(end - start));
        System.out.println("list1 "+list1.size()+" list2 "+list2.size());
    }
}
