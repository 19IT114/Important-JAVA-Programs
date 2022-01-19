package pkgUnitTest1;

import pkgUnitTest1.pkgStringOccurrence.StringOccurrence;

import java.util.Scanner;

public class TestStringOccurrence implements StringOccurrence{
    public void removeOccurrence(String input,char c)
    {
        String s ="";
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i) == c)
                continue;
            else
                s = s+input.charAt(i);
        }
        System.out.println("New String -- > " + s);
    }

    public static void main(String[] ag)
    {
        TestStringOccurrence tso = new TestStringOccurrence();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String --> ");
        String in = sc.nextLine();
        System.out.print("Enter a Character --> ");
        char ch = sc.nextLine().charAt(0);
        tso.removeOccurrence(in,ch);

    }
}
