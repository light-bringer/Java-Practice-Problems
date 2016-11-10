
public class Example {
	public static void main(String args[])
    {
        Derived d=new Derived();
        d.display();
        String x = "1" + 2 + 3;
        String y = 1 + 2 + "3";
        System.out.println(x);
        System.out.println(y);
   a = ['red', 'blue', 'green'];
        a[100] = 'black';
    }

}


class Base
{
     protected void fun()
    {
        System.out.println("Hack");
    }
}

class Derived extends Base
{
    public void display()
    {
        fun();
        System.out.println("Derived");
    }
}

class M
{
    
}