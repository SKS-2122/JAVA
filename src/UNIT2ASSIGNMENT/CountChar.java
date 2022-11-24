package UNIT2ASSIGNMENT;
import java.util.*;
import java.io.*;
public class CountChar
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name");
        String filename=in.nextLine();
        try{
            FileOutputStream fos = new FileOutputStream(filename+".txt");
            System.out.println("Enter a sentence");
            String str = in.nextLine();
           fos .write(str.getBytes());
            fos.close();
            System.out.println("File Created successfully");
        }
        catch(IOException e){
            System.out.println(e);

    }
    }

}
