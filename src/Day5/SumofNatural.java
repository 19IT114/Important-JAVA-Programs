package Day5;

import java.util.Scanner;

public class SumofNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        int sum = n1*(n1+1)/2;
        System.out.println("result : "+sum);
    }
}
