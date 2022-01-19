package week9;
import week9_2.prove_access3;
import java.util.*;

public class prove_access {
    public String a = "I am a public member of class Prove_access";
    private String b = "I am a private member of class Prove_access";
    protected String c = "I am a protected member of class Prove_access";
     String d = "I am a default member of class Prove_access";
     void print()
     {
         // Accessing the members in same class
         System.out.println("******************************");
         System.out.println("<==Accessing members in the same class==>");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
class Sub extends prove_access
{
    //Accept the private members of a class, all the other members of the class can be used in the SAME PACKAGE AND ALSO A SUBCLASS
    public static void main(String[] args) {
        Sub s =  new Sub();
        s.print();
        System.out.println("******************************");
        System.out.println("<==Accessing members in the sub class of the Same class==>");
        System.out.println(s.a);
//        System.out.println(s.b);
        System.out.println(s.c);
        System.out.println(s.d);
        Sub_2 s2 = new Sub_2();
        Sub_2.main("0");

        prove_access_2 pa2 = new prove_access_2();
        pa2.Print();

        prove_access3 pa3 = new prove_access3();
        pa3.display();


    }

}
