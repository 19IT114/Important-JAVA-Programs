package Day5;

import java.util.Scanner;

public class Bitdiv {
    public static void main(String[] args) {

        int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        res = n1>>1;
        System.out.println("Result : "+res);
    }
}
