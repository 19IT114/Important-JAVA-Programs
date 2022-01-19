package Day5;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();

        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;
        System.out.println("N1 = "+n1);
        System.out.println("N2 = "+n2);

    }
}
