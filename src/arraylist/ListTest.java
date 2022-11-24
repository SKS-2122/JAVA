package arraylist;
import java.util.*;
public class ListTest
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list .add(1);
        list .add(2);
        list.add(3);
        list .add(4);
        list .add(5);
        System.out.println("Original list :"+ list);

        System.out.println("Enter the  element to be inserted");
        int ele =in.nextInt();
        System.out.println("Enter the position");
        int p=in.nextInt();
        list.add(p,ele);
        System.out.println("Updated List "+list);
    }
}
