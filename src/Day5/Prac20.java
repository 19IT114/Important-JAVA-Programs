package Day5;

import java.util.Scanner;

public class Prac20 {
    public static void main(String[] args) {
        String newno = "";
        int c=0,n1=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();
        System.out.print("K : ");
        int k = sc.nextInt();
        System.out.print("P : ");
        int p = sc.nextInt();
        sc.close();
        String bin = Integer.toBinaryString(n);
        int l = bin.length();
        while (p + k - 1 > l) {
            bin = 0 + bin;
            l = bin.length();
        }
        System.out.println(bin);
        if(p!=1)
        newno = bin.substring(l-k-1,l-p+1);
        else
            newno = bin.substring(l-k);
        System.out.println(newno);
        for(int i = newno.length()-1;i>=0;i--,c++)
        {
            n1 = n1 + (int)Math.pow(2,c)*Integer.parseInt(newno.charAt(i)+"");
        }
        System.out.println("Res = "+n1);
    }
    }
