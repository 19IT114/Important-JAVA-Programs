package week_10;

import java.io.IOException;

public class overloading {
    void display() throws UserDefinedException
    {
        System.out.println("Super Class");
    }
}

class Base extends overloading
{
    void display() throws UserDefinedException
    {
        System.out.println("Base Class");
        throw new UserDefinedException("Exception thrown");
    }
    void output()
    {
        System.out.println("Inside another method");
    }

    public static void main(String[] args)  {
        overloading b =new Base();

        try{
            b.display();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
