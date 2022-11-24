package IOJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exampleRead
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fis = new FileInputStream("D://personal//java//OOPSUniversity//src//IOJava//test.txt");
            int x;
            x=fis.read();
            while(x!=-1)
            {
                System.out.print((char)x);
                x=fis.read();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
