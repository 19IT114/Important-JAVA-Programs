public class Parent {

    Parent()
    {

        System.out.println("Parent class default constructor called.");
    }
    Parent(int u)
    {
        System.out.println("Parent class 1 parameter constructor called.");
    }
    Parent(int i, int u)
    {
        System.out.println("Parent class 2 parameter constructor called.");
    }
    void display()
    {
        System.out.println("This is parent class & contains 3 constructors");
    }
}

class Child extends Parent
{

    Child()
    {
        System.out.println("Child class Default constructor");
    }
    Child(int k)
    {
        super(1,4);
        System.out.println("Child class 1 parameter constructor called.");
    }
    void display()
    {
        super.display();
        System.out.println("This is child class & contains 2 constructors");
    }

    public static void main(String[] args)
    {
        Child c = new Child(5);
        c.display();

    }
}
