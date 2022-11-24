import java.util.*;
public class ForLoopTest
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Name : Sachin Kumar Singh");
        System.out.println("UID : 21BCS9217");
        System.out.println("Enter the Range");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even Number :"+i);
            }
            else{
                System.out.println("Odd Number :"+i);
            }
        }
    }
}
