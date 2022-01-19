package pkgUnitTest1;
import pkgUnitTest1.pkgTwinPrime.TwinPrime;

import java.util.Scanner;

public class TestTwinPrime implements TwinPrime {
    public void generateSeries(int Number)
    {
        int[] series = new int[Number/4];

        int c=0,flag = 0;
        System.out.println("Prime Numbers are : ");
        for(int i=2;i<=Number;i++)
        {
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.print(i+" ");
            }
            flag = 0;
        }
        System.out.println();

        System.out.println("Twin Prime Numbers are : ");
        for(int i=2;i<Number;i++)
        { int j=i+2;
            if(isPrime(i) == true)
            {
                if(isPrime(j) == true)
                {
                    System.out.print("("+i+","+(j)+") , ");
                    series[c++] = i+j;
                }
            }
        }
        System.out.println();
        System.out.println("Series : ");
        for(int i=0;i<series.length;i++)
        {
            if(series[i]!=0)
            {
                System.out.print(series[i]+",");
            }
        }

    }

    boolean isPrime(int n)
    {
        int flag = 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag = 1;
                break;
            }
        }
            if(flag == 0)
            {
                return true;
            }
            else
                return false;

    }
    public static void main(String[] args)
    {
        TestTwinPrime ttp = new TestTwinPrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit upto which you want to generate series : ");
        int limit = sc.nextInt();
        ttp.generateSeries(limit);
    }
}
