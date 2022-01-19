package week9;

public class prove_access_2 {
    void Print()
    {
        System.out.println("******************************");
        System.out.println("<==Accessing members in another class of the same package==>");
        prove_access pa = new prove_access();
        System.out.println(pa.a);
//        System.out.println(pa.b);
        System.out.println(pa.c);
        System.out.println(pa.d);
    }

}
class Sub_2 extends prove_access_2
{
    public static void main(String args) {
        System.out.println("******************************");
        System.out.println("<==Accessing members in the sub class of another class==>");
        Sub s = new Sub();
        System.out.println(s.a);
//      System.out.println(s.b);
        System.out.println(s.c);
        System.out.println(s.d);
    }

}
