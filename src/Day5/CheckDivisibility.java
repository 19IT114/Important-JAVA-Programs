package Day5;

import java.util.Scanner;

public class CheckDivisibility {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        if((n1>>1)<<1 == n1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
