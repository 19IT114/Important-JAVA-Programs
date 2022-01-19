package SGP_HybridCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    void Program() throws IOException {
        int[] skip = {1, 2, 3, 4};
        int c = 1,from = 0;
        boolean iserror = false;
        String bin = "", hex = "", oct = "", dec = "";
        String[] heads = {"Decimal", "Binary", "Octal", "Hexa-Decimal"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Decimal (10)\n2.Binary (2)\n3.Octal (8)\n4.Hexa-Decimal (16)");
        System.out.println("********************");
        while (c == 1) {
            iserror = false;
            System.out.print("You want to convert : ");
            from = Integer.parseInt(br.readLine());
            if(!(from>=1 && from<=4))
            {
                System.out.println("Invalid Choice");
                continue;
            }
            System.out.print(heads[from - 1] + " : ");
            String no = br.readLine();


            switch (from) {
                case 1: {
                    try {
                        dec = no;
                        bin = Integer.toBinaryString(Integer.parseInt(no));
                        oct = Integer.toOctalString(Integer.parseInt(no));
                        hex = Integer.toHexString(Integer.parseInt(no));
                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid Decimal number.\nA decimal number greater than or equal to 0 is expected");
                        iserror = true;

                    }
                    break;
                }
                case 2: {
                    try {
                        dec = String.valueOf(Integer.parseInt(no, 2));
                        bin = no;
                        oct = Integer.toOctalString(Integer.parseInt(dec));
                        hex = Integer.toHexString(Integer.parseInt(dec));
                    }
                    catch(Exception e)
                    {
                        System.out.println("Invalid Binary number\nEach individual digit in Binary number is expected to be 0 or 1");
                        iserror = true;
                    }
                    break;
                }
                case 3: {
                    try {
                        dec = String.valueOf(Integer.parseInt(no, 8));
                        bin = Integer.toBinaryString(Integer.parseInt(dec));
                        oct = no;
                        hex = Integer.toHexString(Integer.parseInt(dec));
                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid Octal Number\nEach individual digit in Octal number ranges from 0 to 7");
                        iserror = true;
                    }
                    break;
                }
                case 4: {
                    try {
                        dec = String.valueOf(Integer.parseInt(no, 16));
                        bin = Integer.toBinaryString(Integer.parseInt(dec));
                        oct = Integer.toOctalString(Integer.parseInt(dec));
                        hex = no;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid Hexa-Decimal number\nEach individual digit in Hexa-Decimal number ranges from 0 to 15");
                        iserror = true;
                    }
                    break;
                }
                default:
                {
                    System.out.println("Invaliid Choice");
                }
            }
            if(!iserror) {
                System.out.println("DECIMAL      : " + dec);
                System.out.println("BINARY       : " + bin);
                System.out.println("OCTAL        : " + oct);
                System.out.println("HEXA-DECIMAL : " + hex);
            }
            System.out.println("********************");
            System.out.println("Press 1 : USE IT AGAIN");
            System.out.print("Press 0 : EXIT --> ");
            c = Integer.parseInt(br.readLine());
        }

    }
}
