package Day5;

import java.util.Scanner;

public class complement {
    public static void main(String[] args) {
        int sum=0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        int n2 = n1;
        String bin =Integer.toBinaryString(n2);
        if(n1!=0)
        {
            for (int i = bin.length() - 1; i >= 0; i--,c++) {
                if (bin.charAt(i) == '0') {
                    sum = sum + (int) (Math.pow(2, c) * 1);
                } else {
                    sum = sum + (int) (Math.pow(2, c) * 0);
                }
            }
            System.out.println("1's complement of " + n1 + " = " + sum);
        }
        else
            System.out.println("1's complement of 0 = 1");

    }
}
