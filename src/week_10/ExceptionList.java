package week_10;

public class ExceptionList {
     void m1() // ArrayIndexOutOfBoundsException
     {
         int[] a = {1,2,3};
         try {
             System.out.println(a[5]);
         }
         catch (ArrayIndexOutOfBoundsException x)
         {
             System.out.println("Oops...! Out of range"+x);
         }
     }

    void m2() // StringIndexOutOfBoundsException
    {
        String V = "Hello";

        try {
            System.out.println(V.charAt(6));
        }
        catch (StringIndexOutOfBoundsException x)
        {
            System.out.println("Oops...! Out of range");
        }
    }

    void m3() // NumberFormatException
    {
        String V = "Hello";

        try {
            System.out.println(Integer.parseInt(V));
        }
        catch (NumberFormatException x)
        {
            System.out.println("Oops...! Invalid Conversion");
        }
    }

    void m4() //ArithmeticException
    {
        int a = 0;
        int b = 5;
        try{
            System.out.println(b/a);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Oops...! Division not possible");
        }
    }

    void m5() // NumberFormatException
    {
        String V = null;

        try {
            System.out.println(V.charAt(1));
        }
        catch (NullPointerException x)
        {
            System.out.println("Oops...! It is null ..");
        }
    }

    public static void main(String[] args) {
        ExceptionList el = new ExceptionList();
        el.m1();
        el.m2();
        el.m3();
        el.m4();
        el.m5();
    }
}
