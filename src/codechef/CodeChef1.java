package codechef;

import java.util.Scanner;

class CodeChef1
{
    public static void main(String[] args) {
        int t = 0,n=0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int p1=0,p2=0;
        while(t-- > 0)
        {   p1=0;p2=0;
            n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                if(i == 1) {
                    p2 += a[i];
                    continue;
                }
                if(i==0)
                {
                    p1 += a[i];
                    continue;
                }
                if(i%2 != 0)
                {
                    p1 += a[i];
                }
                else
                {
                    p2 += a[i];
                }
            }
            if(p1 > p2)
                System.out.println("first");
            else if(p2 > p1)
                System.out.println("second");
            else
                System.out.println("draw");

        }
    }
}