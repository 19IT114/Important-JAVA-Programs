package SGP_HybridCalc;

import java.util.Scanner;

public class Time {
    void Time()
    {
        int c = 1;
        int to = 10;
        Scanner sc = new Scanner(System.in);
        double conversion[][] = {{1,0.001,1.0e-6,1.67e-8,2.78e-11,1.1574e-11,1.653e-13,3.2e-14},
                {1000,1,1.0e-3,1.7e-5,2.78e-8,1.1574e-8,1.653439e-9,3.168e-11},
                {1.0e6,1000,1,1.67e-2,2.78e-4,1.2e-5,2.0e-6,3.168e-8},
                {6.0e7,60000,60,1,1.67e-2,6.94e-4,9.9e-5,2.0e-6},
                {36e8,36e5,3600,60,1,4.167e-2,5.952e-3,1.14e-4},
                {8.64e10,8.64e7,86400,1440,24,1,1.42857e-1,2.738e-3},
                {6.048e11,6.048e8,604800,10080,168,7,1,1.9165e-2},
                {3.15576e13,3.15576e10,3.15576e7,525960,8766,365.25,522.17857,1}
        };
        String[] heads = {"Microseconds","Milliseconds","Seconds","Minutes","Hours","Days","Week","Years"};
        String[] units = {"μs","ms","sec","min","Hours","days","Weeks","Years"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Microseconds\n2.Milliseconds\n3.Seconds\n4.Minutes\n5.Hours\n6.Days\n7.Week\n8.Years");
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
                System.out.println(heads[to - 1] + " : " + Math.round(ans) + " "+ units[to-1]);
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
