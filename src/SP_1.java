
abstract class Class1
{
    void greet()
    {
        System.out.println("Hello..!");
    }
    void name()
    {
        System.out.println("My name is Virag");
    }
    abstract void surname();
}
class Class2 extends Class1
{
    void greet()
    {
        System.out.println("Namaste..!");
    }
    void name()
    {
        System.out.println("My name is Prateek");
    }
    void surname()
    {
        System.out.println("My surname is Patel");
    }
}

public class SP_1 extends Class2{
    void greet()
    {
        System.out.println("Kem cho..!");
    }
    void name()
    {
        System.out.println("My name is Bittu");
    }
    void surname()
    {
        System.out.println("My surname is Patel");
    }


    public static void main(String[] ag)
    {
        Class1  S = new SP_1();
        S.surname();
        Class2 c = new Class2();
        c.greet();

    }
}
