package Day5;

import java.util.Scanner;

public class PRAC25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = sc.nextInt();
        System.out.print("n2 : ");
        int n2 = sc.nextInt();
        System.out.print("character : ");
        char c = sc.next().charAt(0);
        double res=0;
        switch(c)
        {
            case '+':
            {
                System.out.println("Result : "+n1+n2);
                break;
            }
            case '-':
            {
                System.out.println("Result : "+(n1-n2));
                break;
            }
            case '*':
            {
                System.out.println("Result : "+n1*n2);
                break;
            }
            case '/':
            {
                System.out.println("Result : "+(double)n1/n2);
                break;
            }
            default:
            {
                System.out.println("Invalid Character");
                break;
            }

        }

    }
}
