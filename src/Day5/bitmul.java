package Day5;

import java.util.Scanner;

public class bitmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();
        int pro =0;
        while (n2 != 0) {
            int n3 = n2&1;
            if (n3 == 1)
            {
                pro += n1;
            }
            n1 <<= 1;
            n2 >>= 1;
        }
        System.out.println("Result : "+pro);
    }
}
