import java.util.*;
public class test
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arraylist : ");
        int Size = sc.nextInt();

        ArrayList<ArrayList<Integer>> check = new ArrayList<>(Size);

        for (int i = 0; i<Size; i++ ) {
            check.add(new ArrayList<>());
        }

        for (int i = 0; i<Size; i++) {
            for (int j =0; j<Size; j++) {
                System.out.println("Enter the data at index [" + i + "][" + j + "] : ");

                check.get(i).add(sc.nextInt());
            }
        }

        System.out.println(check);
    }
    }


