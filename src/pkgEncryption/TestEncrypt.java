package pkgEncryption;

import pkgEncryption.pkgTransformation.Transform;

import java.util.Scanner;

public class TestEncrypt implements Transform {
    public void encrypt(String input)
    {
        String res ="";
        for(int i=0;i<input.length();i++)
        {
            char a = input.charAt(i);
            char replace = (char) (a + 3);
            if(replace > 90)
            {
                res = res + (char)(replace-26);
            }
            else
            {
                res = res + (char)(replace);
            }
        }
        System.out.println("Encryted String --> "+res);
    }

    public static void main(String[] args)
    {
        TestEncrypt t = new TestEncrypt();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String \"!..in Capital letters only..!\"to Encrypt --> ");
        String in = sc.nextLine();
        t.encrypt(in);
    }

}
