package MultiThreadingPractice;
class myThread3 implements Runnable
{
    public void run()
    {
        int i=0;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class example3
{
    public static void main(String args[])
    {
        myThread3 m= new myThread3();
        Thread t= new Thread(m);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }

    }
}
