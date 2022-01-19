import java.util.Scanner;

public class DatePredictor {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Mind Reader.");
        System.out.println("Guidline : After every step press the Enter key.");
        System.out.println("So lets begin");
        System.out.println("--------------------------");
        System.out.println("1. Think of a Date of the current year : Eg: 22.08 (22nd August) ");
        System.out.println("2. Multiply the month number by 2 and remember the result.");
        System.out.println("3. Add 5 to result you got from step number 2.");
        System.out.println("4. Multiply the result with 5, that you got from step 3.");
        System.out.println("5. Now, multiply the result of step 5 with 10.");
        System.out.println("6. Add the date you choose in the result of step 5.");
        System.out.print("7. Enter your Result : ");
        int res = sc.nextInt();
        System.out.println("--------------------------");
        int c = 0;
        String Month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int n1,n2;
        n2 = n1 = res;
        int dd = n2%100 - 50;
        int mm = n2/100 - 2;
        if(mm>0 & mm<13 && dd>0 && dd<32)
            System.out.println("You Choose : "+dd+","+Month[mm-1]);
        else
            System.out.println("Sorry invalid date. There might be some problem with your calculations...!!!");
        System.out.println("--------------------------");
    }
}
