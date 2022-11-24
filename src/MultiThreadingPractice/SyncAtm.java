package MultiThreadingPractice;

class ATM
{
  synchronized   public void checkBalance(String name)
    {
        System.out.print(name+" checking ");
        try{
            Thread.sleep(1000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Balance");
    }
   synchronized public void withDrawl(String name , int amount) {
        System.out.print(name + " withdrawal ");
        try {
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(amount);
    }
}

class customer extends Thread
{
    String name;
    int amount;
    ATM atm;
    customer(String name,ATM atm, int amount)
    {
        this.name=name;
        this.atm=atm;
        this.amount=amount;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withDrawl(name,amount);
    }
    public void run()
    {
        useATM();
    }
}
public class SyncAtm
{
    public static void main(String args[])
    {
        ATM atm = new ATM();
        customer c1 = new customer("Sachin",atm,10000);
        customer c2= new customer("Singh",atm,12000);
        c1.start();
        c2.start();
    }
}
