import java.util.*;
public class reverseString
{
    public  static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        String str=in.nextLine();
        str=str+" ";
        String str2[]= new String[str.length()];
        String word="";
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
               str2[j]=word;
               j++;
               word="";
            }
            else {
                word=word+str.charAt(i);
            }
        }

        for(int i=j-1;i>=0;i--)
        {
            System.out.print(str2[i]+" ");
        }
    }
}
