package MultiThreadingPractice;

class myThread5 extends Thread
{
    public myThread5(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while(true)
        {
           System.out.println(i++);
           try{
               Thread.sleep(1000);
           }
           catch (InterruptedException e)
           {
               System.out.println(e);
           }
        }
    }
}
public class example5
{
    public static void main(String args[])
    {
       myThread5 t= new myThread5("My Thread");
       t.start();
       t.interrupt();

    }
}
