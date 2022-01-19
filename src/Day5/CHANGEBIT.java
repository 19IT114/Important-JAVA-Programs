package Day5;

import java.util.Scanner;

public class CHANGEBIT {
    public static void main(String[] args) {
        int sum=0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Key : ");
        int key = sc.nextInt();
        int n2 = n1;
        String bin =Integer.toBinaryString(n2);

        if(n1!=0)
        {
            for (int i = bin.length() - 1; i >= 0; i--,c++) {
                if(c==key-1) {
                    if (bin.charAt(i) == '0') {
                        sum = sum + (int) (Math.pow(2, c) * 1);
                    } else {
                        sum = sum + (int) (Math.pow(2, c) * 0);
                    }
                }
                else {
                    if (bin.charAt(i) == '0') {
                        sum = sum + (int) (Math.pow(2, c) * 0);
                    } else {
                        sum = sum + (int) (Math.pow(2, c) * 1);
                    }
                }
            }
            System.out.println("Result = " + sum);
        }
        else
            System.out.println("1's complement of 0 = 1");

    }
}
