package SGP_HybridCalc;

import java.util.Scanner;

public class Power {
    void Power()
    {
        int c = 1;
        int to = 10;
        Scanner sc = new Scanner(System.in);
        double conversion[][] = {{1,0.001,0.001341,44.25373,0.056869,},
                {1000,1,1.341022,44253.73,56.86902},
                {745.6999,0.7457,1,33000,42.40722},
                {0.022597,0.000023,0.00003,1,0.001285},
                {17.58427,0.017584,0.023581,778.1694,1},

        };
        String[] heads = {"Watts","Kilowatts","Horsepower","Foot-pounds/minute","BTUs/minute"};
        String[] units = {"W","KW","HP","ft⋅lbf/min","btu/min"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Watts (W)\n2.Kilowatts (KW)\n3.Horsepower (HP)\n4.Foot-pounds/minute (ft⋅lbf/min)\n5.BTUs/minute (btu/min)");
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
