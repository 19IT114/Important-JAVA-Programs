package SGP_HybridCalc;

import java.util.Scanner;

public class Temperature {
    void Temperature()
    {
        int c = 1,to=0;
        Scanner sc = new Scanner(System.in);
        int[][] conversion = {{1,12,13},{21,1,23},{31,32,1}};
        String[] heads = {"Celcius","Fahrenheit","Kelvin"};
        String[] units = {"C","F","K"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1. Celcius (C)\n2. Fahrenheit (F)\n3. Kelvin (K)");
        System.out.println("********************");
        while (c == 1) {
            System.out.print("You want to convert : ");
            int from = sc.nextInt();
            if (from >= 1 & from <= heads.length) {
                System.out.print("You want to convert "+heads[from-1]+" to : ");
            } else {
                System.out.println("Oops...Invalid Input...! Please enter the required input.");
                continue;
            }
            to = sc.nextInt();

            if (to >= 1 & to <= heads.length) {
                System.out.print("Enter " + heads[from - 1] + " : ");
                double input = sc.nextDouble();
                double ans = 0;
                switch(conversion[from-1][to-1])
                {
                    case 12: // Celcius to Fahrenheit
                    {
                        ans = (input*9/5)+32;
                        break;
                    }
                    case 13: //Celcius to Kelvin
                    {
                        ans = input+273.15;
                        break;
                    }
                    case 21: // Fahrenheit to Celcius
                    {
                        ans = (input-32)*5/9;
                        break;
                    }
                    case 23: // Fahrenheit to Kelvin
                    {
                        ans = (input-32)*5/9 + 273.15;
                        break;
                    }
                    case 31: // Kelvin to Celcius
                    {
                        ans = input - 273.15;
                        break;
                    }
                    case 32: // Kelvin to Fahrenheit
                    {
                        ans = (input-273.15)*9/5 + 32;
                        break;
                    }
                    default: // Conversion to the same type
                    {
                        ans = input;
                        break;
                    }
                }

                System.out.println(heads[to - 1] + " : " + ans + " "+ units[to-1]);
                System.out.print("To use the Temperature convertor again, press 1 or else 0. : ");
                c = sc.nextInt();
                System.out.println("********************");
            } else {
                System.out.println("Oops...Invalid Input...!");
                System.out.println("*************************");
            }

        }
    }
}
