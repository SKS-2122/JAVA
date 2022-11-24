package prg1;

public class Drawing
{
    public static void main(String arga[])
    {
        System.out.println("Abstract class object shape");
        shape s1= new circle();
        s1.draw();
        shape s2 = new rectangle();
        s2.draw();
        System.out.println("Circle object");
        circle c= new circle();
        c.draw();
        c.color();
        System.out.println("Rectangle object");
        rectangle r= new rectangle();
        r.draw();
        r.color();
    }
}
