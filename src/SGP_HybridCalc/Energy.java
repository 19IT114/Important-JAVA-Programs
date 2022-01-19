package SGP_HybridCalc;

import java.util.Scanner;

public class Energy {
   void Energy() {
        int c = 1;
        int to = 10;
        Scanner sc = new Scanner(System.in);
        double conversion[][] = {{1,1.602177e-19,1.602177e-22,3.829294e-20,3.829294e-23,1.181705e-19,1.518570e-22},
                {6.241509e18,1,0.001,0.239006,0.000239,0.737562,0.000948},
                {6.241509e+21,1000,1,239.006,0.239006,737.5621,0.947817},
                {2.6114489e+19,4.184,0.004184,1,0.001,3.08596,0.003966},
                {2.611448e+22,4184,4.184,1000,1,3085.96,3.965666},
                {8.462350e+18,1.355818,0.001356,0.324048,0.000324,1,0.001285},
                {6.585142e+21,1055.056,1.055056,252.1644,0.252164,778.1694,1}};
        String[] heads = {"Electron Volts", "Joules", "Kilojoules","Thermal Calories","Food Calories","Foot-Pounds","British thermal units"};
        String[] units = {"eV","J","KJ","calories","calories","ft-lb","btu"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Electron Volts (eV)\n2.Joules (J)\n3.KiloJoules (KJ)\n4.Thermal Calories(calorie)\n5.Food Calories(calories)\n6.Foot-Pounds (ft-lb)\n7.British Thermal unit (btu)");
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
