package UNIT2ASSIGNMENT;
import java.util.*;
import java.io.*;
public class Question7read
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name to be read");
        String fileName = in.nextLine();
        try
        {
            FileReader reader = new FileReader(fileName+".txt");
            System.out.println("Reading File...");
            int data =reader.read();
            while (data !=-1)
            {
                System.out.print((char)data);
                data=reader.read();
            }
            System.out.println();
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
