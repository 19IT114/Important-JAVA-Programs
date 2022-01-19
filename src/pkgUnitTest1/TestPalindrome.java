package pkgUnitTest1;
import pkgUnitTest1.pkgPalindrome.Palindrome;
import java.util.Scanner;
public class TestPalindrome implements Palindrome {
    public void CheckPalindrome(String input)
    {
        String rev = "";

        for(int i=input.length()-1;i>=0;i--)
        {
            rev = rev + input.charAt(i);
        }

        if(rev.equalsIgnoreCase(input))
            System.out.println("String \""+ input + "\" is Palindrome.");
        else
            System.out.println("String \""+ input + "\" is not a Palindrome.");
    }

    public static void main(String[] args)
    {
        TestPalindrome tp = new TestPalindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String --> ");
        String in = sc.nextLine();
        tp.CheckPalindrome(in);
    }
}
