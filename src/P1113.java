import java.util.Arrays;
import java.util.Scanner;



public class P1113 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 integers : ");
        int a[] = new int[10];
        for(int i=0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("The distinct Integers are : ");

        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]==a[j])
                    a[j] = -1;
            }
        }

        for(int i=0;i<10;i++)
        {
            if(a[i]!=-1)
            System.out.print(a[i]+" ");
        }
    }
}
