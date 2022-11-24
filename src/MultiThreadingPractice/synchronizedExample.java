package MultiThreadingPractice;
class syncData
{
   synchronized void display(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
class syncThread1 extends Thread
{
    syncData d;
    syncThread1(syncData d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World");
    }
}
class syncThread2 extends Thread{
    syncData data;
    syncThread2 (syncData data)
    {
        this.data=data;
    }
    public void run()
    {
        data.display("Welcome");
    }
}
public class synchronizedExample
{
    public static void main(String argas[])
    {
        syncData d= new syncData();
        syncThread1 t1 = new syncThread1(d);
        syncThread2 t2 = new syncThread2(d);
        t1.start();
        t2.start();
    }
}
