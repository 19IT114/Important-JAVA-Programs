package SGP_HybridCalc;

import java.util.Scanner;

public class Area {
   void Area()
    {
        int c = 1;
        int to = 10;
        Scanner sc = new Scanner(System.in);
        double conversion[][] = {{1,0.01,0.000001,0.0000000001,1.000000e-12,0.00155,0.000011,0.000001,2.47105e-10,3.86e-13},
                {100,1,0.0001,0.00000001,0.0000000001,0.155,0.001076,0.00012,2.47105e-8,3.86e-11},
                {1000000,10000,1,0.0001,0.000001,1550.003,10.76391,1.19599,0.000247,3.86102159e-7},
                {1.0e+10,1.0e+8,10000,1,0.01,15500031,107639.1,11959.9,2.471054,0.003861},
                {1.0e+12,10.0e+10,1000000,100,1,1550003100,10763910,1195990,247.1054,0.3861},
                {645.16,6.4516,0.000645,6.4516e-8,6.4516e-10,1,0.006944,0.000772,1.59422508e-7,2.49098e-10},
                {92903.04,929.0304,0.09290304,9.0e-6,9.20304e-8,144,1,0.111111,0.000023,3.587e-8},
                {836127.4,8361.274,0.8361274,0.000084,8.3612736e-7,1296,9,1,0.000207,3.2283e-7},
                {4.046856422e+10,4.046856422e+8,4046.856,0.404686,0.004047,6272640,43560,4840,1,0.001563},
                {2.5899988110336e+12,2.5899988110336e+10,2589988,258.9988,2.589988,4014489600.0,27878400.0,307600,640,1}
        };
        String[] heads = {"Square millimetres","Square centimetres", "Square metres","Hectares","Square Kilometres","Square inches","Square feet","Square yards","Acres","Square miles"};
        String[] units = {"mm^2","cm^2","m^2","Hectares","Km^2","inch^2","ft^2","yd^2","acre","mile^2"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Square millimetres (mm^2)\n2.Square centimetres (cm^2)\n3.Square metres (m^2)\n4.Hectares (Hectare)\n5.Square Kilometres (Km^2)\n6.Square inches (inch^2)\n7.Square feet (ft^2)\n8.Square yards (yd^2)\n9.Acres (acres)\n10.Square miles (mile^2)");
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
                System.out.println(heads[to - 1] + " : " + (ans) + " "+ units[to-1]);
                System.out.print("To use the Data convertor again, press 1 or else 0. : ");
                c = sc.nextInt();
                System.out.println("********************");
            } else {
                System.out.println("Oops...Invalid Input...!");
                System.out.println("*************************");
            }

        }
    }
}
