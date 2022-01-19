package Day5;

import java.util.Scanner;

public class PRAC27 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Integer : ");
        int i= sc.nextInt();
        System.out.println("Floating point : ");
        float f = sc.nextFloat();
        float res = (float)i/f;
        System.out.printf("%.3f",res);

    }
}
