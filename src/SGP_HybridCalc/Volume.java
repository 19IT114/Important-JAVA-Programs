package SGP_HybridCalc;

import java.util.Scanner;

public class Volume {
    void Volume()
    {
        int c = 1;
        int to = 10;
        double ans =0;
        Scanner sc = new Scanner(System.in);
        double conversion[] = {1,1,0.001,0.000001,0.202884,0.067628,0.033814,0.004227,0.002113,0.001057,0.000264,0.061024,0.000035,0.000001,0.168936,0.056312,0.035195,0.00176,0.00088,0.00022};
        String[] heads = {"Millilitres","Cubic centimetres", "Litres", "Cubic metres","Teaspoons","Tablespoons","Fluid ounces","Cups (US)","Pints (US)","Quarts (US)","Gallons (US)","Cubic inches","Cubic feet","Cubic yards","Teaspoons (UK)","Tablespoons (UK)","Fluid Ounces (UK)","Pints (UK)","Quarts (UK)","Gallons(UK)"};
        String[] units = {"mL","cm^3","L","m^3","teaspoons","tablespoons","fl oz","cups","pints","quarts","gal","inch^3","ft^3","yards^3","teaspoons","tablespoons","fl oz","pints","quarts","gal"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Millilitres\n2.Cubic centimetres\n3.Litres\n4.Cubic metres\n5.Teaspoons (US)\n6.Tablespoons (US)\n7.Fluid ounces (US)\n8.Cups (US)\n9.Pints (US)\n10.Quarts (US)\n11.Gallons (US)\n12.Cubic inches\n13.Cubic feet\n14.Cubic yards\n15.Teaspoons (UK)\n16.Tablespoons (UK)\n17.Fluid Ounces (UK)\n18.Pints (UK)\n19.Quarts (UK)\n20.Gallons(UK)");
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
                if(from < to) {
                    ans = input * (conversion[to - 1]/conversion[from-1]);
                }
                else
                    ans = input / (conversion[from-1]/conversion[to-1]);
                System.out.println(heads[to - 1] + " : " + ans + " "+ units[to-1]);
                System.out.print("To use the Volume convertor again, press 1 or else 0. : ");
                c = sc.nextInt();
                System.out.println("********************");
            } else {
                System.out.println("Oops...Invalid Input...!");
                System.out.println("*************************");
            }

        }
    }
}
