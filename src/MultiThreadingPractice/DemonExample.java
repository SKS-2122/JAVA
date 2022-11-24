package MultiThreadingPractice;
class DemonThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i++);

        }
    }
}
public class DemonExample
{
    public static void main(String args[])
    {
        DemonThread t= new DemonThread();
        t.setDaemon(true);
        t.start();

        try{
            Thread.sleep(100);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
