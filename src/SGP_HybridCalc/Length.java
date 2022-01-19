package SGP_HybridCalc;

import java.util.Scanner;

public class Length {
    void Length()
     {
        int c = 1;
        int to = 10;
        Scanner sc = new Scanner(System.in);
        double conversion[][] = {
                {1,1.0e-3,1.0e-6,1.0e-7,1.0e-9,1.0e-12,3.9370079e-8,3.28084e-9,1.093613e-9,6.21e-13,5.4e-13},
                {1000,1,1.0e-3,1.0e-4,1.0e-6,1.0e-9,3.9e-5,3.2e-6,1.09e-6,6.21e-10,5.39957e-10},
                {1.0e6,1000,1,1.0e-1,1.0e-3,1.0e-6,3.9e-2,3.281e-3,1.094e-3,6.21e-7,5.39957e-7},
                {1.0e5,10000,10,1,1.0e-2,1.0e-5,3.937e-1,3.2808e-2,1.0936e-2,6.21e-6,5.39957e-6},
                {1.0e9,1.0e6,1.0e3,100,1,1.0e-3,39.37008,3.28084,1.093613,6.21e-4,5.39957e-4},
                {1.0e12,1.0e3,1.0e6,100000,1000,1,39370.08,3280.84,1093.613,0.621371,0.53957},
                {25400000,25400,25.4,2.54,0.0254,2.54e-5,1,8.333e-2,2.7778e-2,1.6e-5,1.4e-5},
                {304800000,304800,304.8,30.48,0.3048,3.05e-4,12,1,0.33333,0.000189,0.000165},
                {914400000,914400,914.4,91.44,0.9144,9.14e-4,36,3,1,5.68e-4,4.94e-4},
                {1609344e6,1609344000,1609344,160934.4,1609.344,1.609344,63360,5280,1760,1,0.868976},
                {1852e9,1852000000,1852000,185200,1852,1.852,72913.39,6076.115,2025.372,1.150779,1}
        };
        String[] heads = {"Nanometres", "Microns", "Millimetres","Centimetres","Metres","Kilometres","Inches","Feet","Yards","Miles","Nautical Miles"};
        String[] units = {"nm","μ","mm","cm","m","Km","inches","ft","yards","mi","NM"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Nanometres (nm)\n2.Microns (μ)\n3.Millimetres (mm)\n4.Centimetres (cm)\n5.Metres (m)\n6.Kilometres (Km)\n7.Inches(inches)\n8.Feet (ft)\n9.Yards (yards)\n10.Miles (mi)\n11.Nautical Miles(NM)");
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
                double ans = input * conversion[from - 1][to - 1];
                System.out.println(heads[to - 1] + " : " + ans + " "+ units[to-1]);
                System.out.print("To use the Length convertor again, press 1 or else 0. : ");
                c = sc.nextInt();
                System.out.println("********************");
            } else {
                System.out.println("Oops...Invalid Input...!");
                System.out.println("*************************");
            }

        }
    }
}
