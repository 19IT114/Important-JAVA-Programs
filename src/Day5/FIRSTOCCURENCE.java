package Day5;

import java.util.Scanner;

public class FIRSTOCCURENCE {
    public static void main(String[] args){
        int c=1;
        Scanner sc = new Scanner (System.in);
        System.out.print("N1 = ");
        int n = sc.nextInt();
        String bin = Integer.toBinaryString(n);
        for(int i=bin.length()-1;i>=0;i--,c++)
        {
            if(bin.charAt(i) == '1')
            {System.out.println("Position : "+(c));
            break;}
        }
    }
}
