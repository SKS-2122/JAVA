class a
{
    void display()
    {
        System.out.println("Display A");
    }
    void display3()
    {
        System.out.println("Display 3");
    }
}
class b extends a{
    void display()
    {
        System.out.println("Overriding display A");
    }
    void display2()
    {

    System.out.println("Display 2")   ;
    }
}
class c extends b{

}
 class TestAbstraction
{
    public static void main(String args[])
    {
        b obj = new b();
        obj.display3();
        obj.display();
        obj.display2();
        a obj1 = new b();

        obj1.display();
        obj1.display3();
    }

}
