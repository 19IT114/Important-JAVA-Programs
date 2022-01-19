package Day5;

import java.util.Scanner;

public class charmod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char a = (char) sc.nextLine().charAt(0);
        System.out.print("Enter a character : ");
        char b = (char) sc.nextLine().charAt(0);

        int res = (int) (a % b);
        System.out.println("Result : " + res);
    }
}
