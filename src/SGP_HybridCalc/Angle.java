

package SGP_HybridCalc;
import java.util.Arrays;
import java.util.Scanner;

public class Angle {


    void Angle()
    {
        int c=1;
        int to = 10;
        double ans = 0;
        Scanner sc = new Scanner(System.in);
        double conversion[] = {1,0.017453,1.111111};
        String[] heads = {"Degrees","Radians","Gradians"};
        String[] units = {"degree","Radian","Gradian"};
        System.out.println("Enter the corresponding number of your choice whenever asked for.\n1.Degree\n2.Radians\n3.Gradians");
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
