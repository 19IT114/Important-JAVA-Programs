package week9;
import week9_2.Addition;
import java.util.Scanner;

public class Add {


    public static void main(String[] args) {
        Addition d = new Addition();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double b = sc.nextDouble();
        System.out.println("Sum is = "+d.getSum(a,b));

    }

}
