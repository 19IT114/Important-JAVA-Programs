import java.util.Scanner;
public class Calendar {
    boolean isLeapYear(int y)
    {
        if (y%100 == 0)
        {
            if(y%400 == 0)
                return true;
        }
        else if(y%4 == 0) {
            return true;
        }
        else return false;
        return false;
    }
    public static void main(String args[]){
        Calendar c = new Calendar();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();
        if(c.isLeapYear(year))
            System.out.println("It is a leap Year.");
        else
            System.out.println("It is not a leap Year.");
    }
}
