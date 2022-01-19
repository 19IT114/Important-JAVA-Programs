package Day5;

import java.util.Scanner;

public class LSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        int n2 = n1&1;
        if(n2 == 1)
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
