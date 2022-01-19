package SGP_HybridCalc;

import java.util.Scanner;

public class Ressistance {
    public void Resistor() {
        double res = 0.0;
        int flag = 0, c = 0;
        int mul = -1;
        int band = 0;
        int tol = 0;
        int repeat = 1;
        String[] ResColor = {"BLACK", "BROWN", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "VIOLET", "GREY", "WHITE", "GOLD", "SILVER"};
        double[] tolerance = {0, 1, 2, 0.05, 0.02, 0.5, 0.25, 0.1, 0.05, 0, 5, 10};
        int[] tempco = {250, 100, 50, 15, 25, 20, 10, 5, 1, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println();


        while (repeat == 1) {
            System.out.print("Enter the bands (4,5,6) : ");
            int bands = sc.nextInt();
            if (bands >= 4 && bands <= 6) {
                String[] color = new String[bands];
                System.out.println("Enter the color names one by one : ");
                for (int i = 0; i < bands; i++) {
                    System.out.print((i + 1) + " : ");
                    color[i] = sc.next();
                }
                if (bands == 6) {
                    bands = 5;
                    flag = 6;
                }

                for (int i = 0; i < bands; i++) {
                    for (int j = 0; j < ResColor.length; j++) {
                        if (i <= bands - 3) {
                            if (color[i].toUpperCase().equals(ResColor[j]) == true) {
                                res = (res * 10) + j;
                            }
                        } else {
                            if (color[i].toUpperCase().equals(ResColor[j]) == true) {
                                if (mul == -1)
                                    mul = j;
                                tol = j;
                            }
                        }

                    }
                }
                if (flag == 6) {
                    for (int j = 0; j < ResColor.length; j++) {
                        if (color[flag - 1].toUpperCase().equals(ResColor[j]) == true) {
                            if (tempco[j] != 0) {
                                System.out.println("Ressistance = " + (res / 10) + " x 10^" + (mul + 1) + " + " + tolerance[tol] + "% Ω " + tempco[j] + "ppm/K");
                                c = 1;
                            }
                        }
                    }
                }
                if (c != 1) {
                    if (tolerance[tol] != 0)
                        System.out.println("Ressistance = " + (res / 10) + " x 10^" + (mul + 1) + " + " + tolerance[tol] + "% Ω");
                    else
                        System.out.println("Ressistance = " + (res / 10) + " x 10^" + (mul + 1) + " Ω");
                }
                repeat = 0;
            }
            else
            {
                System.out.println("Invalid input...Enter a valid input...!");
                repeat = 1;
            }

        }
    }
}
