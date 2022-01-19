package SGP_HybridCalc;

import java.util.Scanner;


        public class Data {
            void Data()
            {
                int c = 1;
                int to = 10;
                Scanner sc = new Scanner(System.in);
                double conversion[][] = {{1,0.001,0.000001,0.000000001,1.000000e-12,1.000000e-15,1.000000e-18,1.000000e-21,1.000000e-24},
                        {1000,1,0.001,0.000001,0.000000001,1.000000e-12,1.000000e-15,1.000000e-18,1.000000e-21},
                        {1000000,1000,1,0.001,0.000001,0.000000001,1.000000e-12,1.000000e-15,1.000000e-18},
                        {1.0e+9,1000000,1000,1,0.001,0.000001,0.000000001,1.000000e-12,1.000000e-15},
                        {1.0e+12,10.0e+9,1000000,1000,1,0.001,0.000001,0.000000001,1.000000e-12},
                        {1.0e+15,10.0e+12,10.0e+9,1000000,1000,1,0.001,0.000001,0.000000001},
                        {1.0e+18,10.0e+15,10.0e+12,10.0e+9,1000000,1000,1,0.001,0.000001},
                        {1.0e+21,10.0e+18,10.0e+15,10.0e+12,10.0e+9,1000000,1000,1,0.001},
                        {1.0e+24,10.0e+21,10.0e+18,10.0e+15,10.0e+12,10.0e+9,1000000,1000}};
        String[] heads = {"Bytes","Kilobytes", "Megabytes","Gigabytes","Terabytes","Petabytes","Exabytes","Zetabytes","Yottabytes"};
        String[] units = {"B","KB","MB","GB","TB","PB","EB","ZB","YB"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Bytes (B)\n2.Kilobytes (KB)\n3.Megabytes (MB)\n4.Gigabytes (GB)\n5.Terabytes (TB)\n6.Petabytes (PB)\n7.Exabytes (EB)\n8.Zetabytes (ZB)\n9.Yottabytes (YB)");
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
