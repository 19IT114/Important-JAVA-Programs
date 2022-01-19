interface A
{
     static void show(){
        System.out.println("Hello");
    }
}
interface B extends A
{
    void disp();
}
interface C extends A
{
    void output();
}

public class SP_3 implements B,C {
    public void show()
    {
        System.out.println("Inside show");
    }
    public void disp()
    {
        System.out.println("Inside disp");
    }
    public void output()
    {
        System.out.println("Inside Out");
    }
    public static void main(String[] args)
    {
        SP_3 s = new SP_3();
        A.show();
        s.show();
        s.disp();
        s.output();
    }
}
