import java.util.Scanner;

public class Div {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();
        float R = (float)n1/(float)n2;
        System.out.println("Result : "+R);

    }

}
