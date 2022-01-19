package Day5;

import java.util.Scanner;

public class PRAC21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();

        long res = (long) (n1 * n2);
        System.out.println("result : " + res);
    }
}
