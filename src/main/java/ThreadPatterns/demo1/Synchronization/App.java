package ThreadPatterns.demo1.Synchronization;


import java.util.Scanner;

class Processor extends Thread
{
    private  volatile boolean running = true ;

    public void run()
    {
        while (running)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(0);
            }
            catch (InterruptedException iE)
            {
                iE.printStackTrace();
            }
        }
    }

    public void shutDown()
    {
        running = false;
    }
}
public class App {

    public static void main(String args[])
    {
        Processor processor = new Processor();
        processor.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter return key to stop");
        sc.nextLine();

        processor.shutDown();
    }
}
