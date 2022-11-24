package UNIT2ASSIGNMENT;
import java.util.*;
import java.io.*;
public class CountChar2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the File Name ");
        String fileName= in.next();
        System.out.println("Enter the character to be counted");
        char ch =in.next().charAt(0);
        int count=0;
        System.out.println("Reading File from "+fileName+".txt");
        try{
            FileInputStream fis = new FileInputStream(fileName+".txt");
            int data =fis.read();
            while (data !=-1)
            {
                System.out.print((char)data);
                if(data == Character.toUpperCase(ch)||data==Character.toLowerCase(ch))
                    count++;
                data=fis.read();
            }
            fis.close();
            System.out.println();
            System.out.println("File "+fileName+".txt has "+count+" instances of letter '"+ch+"'");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
