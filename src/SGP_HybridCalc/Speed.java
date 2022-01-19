package SGP_HybridCalc;

import java.util.Scanner;

public class Speed {
    void Speed()
    {
        int c = 1;
        int to = 10;
        Scanner sc = new Scanner(System.in);
        double conversion[][] = {{1,0.01,0.036,0.032808,0.022371,0.01944,0.000029},
                {100,1,3.6,3.28084,2.237136,1.944012,0.002939},
                {27.77778,0.277778,1,0.911344,0.621427,0.54003,0.000816},
                {30.48,0.3048,1.09728,1,0.681879,0.592535,0.000896},
                {44.7,0.447,1.6092,1.466535,1,0.868974,0.001314},
                {51.44,0.5144,1.85184,1.687664,1.150783,1,0.001512},
                {34030,340.3,1225.08,1116.47,761.2975,661.5474,1},
                };
        String[] heads = {"Centimetres per second","Metres per second", "Kilometres per hour","Feet per second","Miles per hour","Knots","Mach"};
        String[] units = {"cm/s","m/s","Km/h","feet/s","mph","kn","mach"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Centimetres per second (cm/s)\n2.Metres per second (m/s)\n3.Kilometres per hour (Km/h)\n4.Feet per second (feet/s)\n5.Miles per hour (mph)\n6.Knots (kn)\n7.Mach (mach)");
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
