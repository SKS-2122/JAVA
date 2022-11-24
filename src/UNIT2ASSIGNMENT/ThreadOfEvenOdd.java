package UNIT2ASSIGNMENT;

import java.io.IOException;

class Even extends Thread
{
    public void run()
    {

        {
            for(int i=1;i<=20;i++)
            {
                if(i%2==0)
                    System.out.println("Even Number = "+i);
            }
        }
    }
}
class Odd extends Thread
{
    public void run()
    {
//        synchronized (this)
        {

            for(int i=1;i<=20;i++)
            {
                if(i%2!=0)
                    System.out.println("Odd Number = "+i);
            }
        }
    }
}
public class ThreadOfEvenOdd {
    public static void main(String args[]) throws IOException {
        try {
            System.out.println("Thread Starts...");
            Even t1 = new Even();
            Odd t2 = new Odd();
            t1.start();
            t1.join();
            t2.start();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
