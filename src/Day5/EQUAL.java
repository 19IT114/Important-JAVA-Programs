package Day5;

import java.util.Scanner;

public class EQUAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();

        int n3 = n1&n2;
        if(n3 == n1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
