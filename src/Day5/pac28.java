package Day5;

import java.util.Scanner;

public class pac28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();

        float res = (float)(n1)/(float)(n2);
        System.out.println("Result :"+res);
    }
}
