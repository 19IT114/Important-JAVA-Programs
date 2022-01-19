package SGP_HybridCalc;

import java.util.Scanner;

public class Pressure {
    void Pressure() {
        int c = 1;
        int to = 10;
        Scanner sc = new Scanner(System.in);
        double conversion[][] = {{1,1.01325,101.325,760.1275,101325,14.69595},
                                {0.986923,1,100,750.1875,100000,14.50377},
                                {0.009869,0.01,1,7.501875,1000,0.145038},
                                {0.001316,0.001333,0.1333,1,133.3,0.019334},
                                {0.0000098692,0.00001,0.001,0.007502,1,0.000145},
                                 {0.068046,0.068948,6.894757,51.72361,6894.757,1}};
        String[] heads = {"Atmospheres", "Bars", "Kilo-Pascals","Millimeters of mercury","Pascals","Pounds per square inch"};
        String[] units = {"atm","bar","kPa","mm-Hg","Pa","psi"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Atmospheres (atm)\n2.Bars (bar)\n3.Kilo-Pascals (kPa)\n4.Millimeters of mercury (mm-Hg)\n5.Pascals (Pa)\n6.Pounds per square inch (psi)");
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
                System.out.print("To use the Pressure convertor again, press 1 or else 0. : ");
                c = sc.nextInt();
                System.out.println("********************");
            } else {
                System.out.println("Oops...Invalid Input...!");
                System.out.println("*************************");
            }

        }
    }
}
