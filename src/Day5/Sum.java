import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();
        int R = n1+n2;
        System.out.println("Result : "+R);

    }
}
