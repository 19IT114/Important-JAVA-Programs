package week9_2;
import week9.prove_access;
public class prove_access3  {
     public void display() {
        prove_access pa = new prove_access();
        System.out.println("******************************");
        System.out.println("<==Accessing members in another class of the DIFFERENT package==>");
        System.out.println(pa.a);
//        System.out.println(pa.b);
//        System.out.println(pa.c);
//        System.out.println(pa.d);
    }
}
class Sub_3 extends prove_access
{
    void output()
    {
        Sub_3 pa1 = new Sub_3();
        System.out.println("******************************");
        System.out.println("<==Accessing members in sub class of the DIFFERENT package==>");
        System.out.println(pa1.a);
//        System.out.println(pa1.b);
        System.out.println(pa1.c);
//        System.out.println(pa1.d);
    }
}
