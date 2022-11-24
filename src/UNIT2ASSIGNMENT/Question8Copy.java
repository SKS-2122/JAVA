package UNIT2ASSIGNMENT;
import java.util.*;
import java.io.*;
public class Question8Copy
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter file name from where data to be copied");
        String fileToBeCopy = in.nextLine();
        System.out.println("Enter file name in which data to be copied ");
        String fileToBePasted = in.nextLine();
        try
        {
            FileReader reader= new FileReader(fileToBeCopy+".txt");
            FileWriter writer= new FileWriter(fileToBePasted+".txt");
            System.out.println("Reading File...");
            int data =reader.read();
            while (data !=-1)
            {
                System.out.print((char)data);
                writer.write(data);
                data=reader.read();
            }
            System.out.println();
            System.out.println("File Copied...");
            writer.close();
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
