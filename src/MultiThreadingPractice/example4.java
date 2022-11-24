package MultiThreadingPractice;

class myThread4 extends Thread
{
    public myThread4(String name)
    {
        super(name);

    }
}
public class example4
{
    public static void main(String args[])
    {
        myThread4  t = new myThread4("My Thread");
        System.out.println("ID = "+t.getId());
        System.out.println("Name = "+t.getName());
        System.out.println("Priority = "+t.getPriority());
        t.start();
        System.out.println("State = "+t.getState());
        System.out.println("Alve = "+t.isAlive());
    }
}
