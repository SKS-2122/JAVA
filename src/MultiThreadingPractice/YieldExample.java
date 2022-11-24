package MultiThreadingPractice;

class YieldThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i++ +" YieldThread");
        }
    }
}
public class YieldExample
{
    public static void main(String args[])
    {
        YieldThread t= new YieldThread();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i++ +" Main");
            Thread.yield();
        }
    }
}
