import java.util.Scanner;

public class Program3 {
    int terms;
    void input()
    {
        System.out.print("Enter the number of terms you want in the Fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        terms = sc.nextInt();
    }

    void Display()
    {
        int a=0,b=1,sum=1,i=1;
        while (i<=terms)
        {
            System.out.print(sum+" ");
             sum = a + b;
             a=b;
             b=sum;
             i++;
        }
    }

    public static void main(String a[])
    {
        Program3 p = new Program3();
        p.input();
        p.Display();
    }
}
