package Day5;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class PRAC23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("P : ");
        double p = sc.nextDouble();
        System.out.print("R : ");
        double r = sc.nextDouble();
        System.out.print("T : ");
        double t = sc.nextDouble();


        double res = (double) (p*t*r)/100;
        System.out.println("Interest : " + res);
    }
}
