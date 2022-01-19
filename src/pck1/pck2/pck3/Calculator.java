package pck1.pck2.pck3;

import jdk.swing.interop.SwingInterOpUtils;
import pck1.Add;
import pck1.pck2.Sub;

import java.util.Scanner;

public class Calculator implements Sub, Add {
    public double Add(double a, double b)
    {
        return a+b;
    }
    public double Sub(double a, double b)
    {
        return a-b;
    }

   void Calc()
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        System.out.print("Enter the character = ");
        char x =sc.next().charAt(0);
       System.out.println(x);
        switch(x)
        {
            case '+':
            {
                System.out.println("Answer is = "+Add(a,b));
                break;
            }
            case '-':
            {
                System.out.println("Answer is = "+Sub(a,b));
                break;
            }
            default:
            {
                System.out.println("Ivalid Character");
                break;
            }
        }
    }


}
