package MultiThreadingPractice;

class JoinThread extends Thread
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
public class JoinExample
{
    public static void main(String args[])
    {

        JoinThread t= new JoinThread();
        t.setDaemon(true);
        t.start();
        Thread MainTheead = Thread.currentThread();
        try{
            MainTheead.join();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
