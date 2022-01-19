package SGP_HybridCalc;

import java.util.Scanner;

public class DayCalculator {

        boolean leap(int a) {
            if (a % 100 == 0) {
                if (a % 400 == 0)
                    return true;
                else
                    return false;
            } else if (a % 4 == 0)
                return true;
            else
                return false;
        }

        public void DayCalc()
        {
            int flag = 1;
            Scanner sc = new Scanner(System.in);
            String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
            int maxday[] = {31,28,31,30,31,30,31,31,30,31,30,31};
            int d,m,y,td=0,r,i;
            System.out.println("****WELCOME TO THE DAY CALCULATOR.SO LET'S BEGIN****\n");
            while(flag == 1)
            {
                System.out.println("****************************************************\n");
                System.out.print("Enter the day: ");
                d = sc.nextInt();
                System.out.print("Enter the month: ");
                m = sc.nextInt();
                System.out.print("Enter the year: ");
                y = sc.nextInt();

                if (leap(y))
                    maxday[1] = 29;
                if (d > 0 && m > 0 && m < 13 && y > 0 && d <= maxday[m - 1])
                {
                    for (i = 1; i < y; i++) {
                        if (leap(i))
                            td = td + 2;
                        else
                            td = td + 1;
                    }

                    for (i = 0; i < m - 1; i++)
                        td = td + maxday[i];

                    td = td + d;

                    r = td % 7;
                    System.out.println(d + "/" + m + "/" + y + " ---> " + day[r]);

                }
                else
                {
                    System.out.println("oops...! Its not a valid date");
                }
                System.out.print("To use it again press '1' or else 0 : ");
                flag = sc.nextInt();
            }
        }
}
