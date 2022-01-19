import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class P123 {
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] a = new int[100];
        for(int i=0;i<100;i++)
            a[i] = r.nextInt();
        System.out.print("Enter the index : ");
        int ind = sc.nextInt();
        if(ind>=0 && ind<=100)
            System.out.println("Integer at index "+ind+" is "+a[ind]);
        else
            System.out.println("Out of bounds Exception");
    }
}
