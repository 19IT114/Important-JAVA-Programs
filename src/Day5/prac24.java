package Day5;

import java.util.Scanner;

public class prac24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius : ");
        double r = sc.nextDouble();

        double res = (double) (3.14*r*r);
        System.out.println("result : " + res);
    }
}
