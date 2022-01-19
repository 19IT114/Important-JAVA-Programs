import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList();

        a.add("Mango");
        a.add("Apple");
        a.add("Cherry");
        a.add("Banana");
        System.out.println("Original list : "+a);
        System.out.println("Use of get function a.get(1) : "+a.get(1));
        a.set(0,"Hello");
        System.out.println("After using set function a.set(0,\"Hello\") : "+a);
        a.add(2,"Kiwi");
        System.out.println("After using add function a.add(2,\"Kiwi\") : " + a);
        System.out.println("After using iterator : \n");
        Iterator itr = a.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        a.remove("Apple");
        System.out.println("After using remove function a.remove(\"Apple\"): " + a);

    }
}
