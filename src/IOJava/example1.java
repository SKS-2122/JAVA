package IOJava;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class example1
{
    public static void main(String args[])
    {
        try{
            FileOutputStream fos = new FileOutputStream("D://personal//java//OOPSUniversity//src//IOJava//test.txt");
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a sentence");
            String str = in.nextLine();
            fos.write(str.getBytes());
            fos.close();
            System.out.println("File created");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
