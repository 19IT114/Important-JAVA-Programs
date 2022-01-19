import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class P119 {
    public static void main(String[] args)
    {
        int c=0,r=0,ccount=0,rcount=0,x=0,y=0;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int[][] a = new int[size][size];
        int[] row = new int[size];
        int[] column = new int[size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                a[i][j] = rd.nextInt(2);
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(a[i][j] == 1)
                    r++;
                if(a[j][i] == 1)
                    c++;
                System.out.print(a[i][j]);
            }
            System.out.println("");
            if(r>rcount) {
                rcount = r;
                x=0;
                row[x] = i;
            }
            if(r==rcount)
            {
                row[x++] = i;
            }
            if(c>ccount) {
                ccount = c;
                y=0;
                column[y] = i;
            }
            if(c==ccount)
            {
                column[y++] = i;
            }
            r=0;
            c=0;
        }
        System.out.print("The Largest row index : ");
        for(int i=0;i<x;i++)
            System.out.print(row[i]+",");
        System.out.println("");

        System.out.print("The Largest coloumn index :");
        for(int i=0;i<y;i++)
            System.out.print(column[i]+",");
    }
}
