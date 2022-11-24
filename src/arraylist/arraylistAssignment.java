package arraylist;
import java.util.*;
public class arraylistAssignment
{
    public static void  main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n=in.nextInt();
        System.out.println("Enter the elements of array List");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(i,in.next());

        }

        System.out.println("Reverse words are :");
        for(int i=0;i<n;i++)
        {
            String str =list.get(i);
            char ch []= str.toCharArray();

            for(int j=str.length()-1;j>=0;j--)
            {
                System.out.print(ch[j]);
            }
            System.out.println();
        }
    }
}
