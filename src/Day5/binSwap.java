package Day5;

import java.util.Scanner;

public class binSwap {
    public static void main(String[] args) {
        int c=1,n=0;
        String newno="";
        Scanner sc = new  Scanner(System.in);
        System.out.print("n : ");
        int n1 = sc.nextInt();
        System.out.print("Start position : ");
        int start = sc.nextInt();
        System.out.print("End position : ");
        int end = sc.nextInt();
        System.out.print("bits : ");
        int nob = sc.nextInt();
        sc.close();
        String bin = Integer.toBinaryString(n1);
        int l = bin.length();
        while(end+nob-1 > l)
        {
            bin =  0 + bin;
            l = bin.length();
        }

        StringBuilder str = new StringBuilder(bin);


        if(start+nob-1 < end)
        {
            for(int i=l-1;i>=0;i--,c++)
            {
                if(c>=start && c<=start+nob-1)
                {
                    char x = bin.charAt(i);
                    str.setCharAt(i,bin.charAt(l-end));
                    str.setCharAt(l-end,x);
                    end++;

                }

            }
            c=0;
            for(int i = l-1;i>=0;i--,c++)
            {
                n = n + (int)Math.pow(2,c)*Integer.parseInt(str.charAt(i)+"");
            }
            System.out.println("Res = "+n);
        }
        else
            System.out.println("Swapping not possible");





    }
}
