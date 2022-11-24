package MultiThreadingPractice;

public class example2 extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String args[])
    {
        example2 t= new example2();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
