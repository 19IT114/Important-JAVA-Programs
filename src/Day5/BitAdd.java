package Day5;

import java.util.Scanner;

public class BitAdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();

        while(n2!=0)
        {
            int carry = n1&n2;
            n1 = n1^n2;
            n2 = carry<<1;
        }
        System.out.println("Result : "+n1);
    }

}
