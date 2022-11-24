package UNIT2ASSIGNMENT;
import java.util.*;
import java.io.*;
public class Question7
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the File name");
        String fileName =in.nextLine();
        try{
            FileWriter writer = new FileWriter(fileName+".txt");

            System.out.println("Enter a sentence");
            String str =in.nextLine();
            writer.write(str);
            System.out.println("File Created...");
            writer.close();
        }
        catch (IOException e){
            System.out.println(e);
        }

    }

}
