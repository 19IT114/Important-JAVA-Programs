import java.util.Scanner;

public class ParkingLot { // class declaration
    int vno,hours; // variable declaration
    float bill;

    ParkingLot() // Constructor to initialize the data members
    {
        vno = 0;
        hours = 0;
        bill = 0.0f;
    }

    void Input() // method to take input from the user
    {
        Scanner sc = new Scanner(System.in); // Using Scanner class to accept the input from user
        System.out.print("Enter the Vehicle number : ");
        vno = sc.nextInt();
        System.out.print("Enter the hours for which the vehicle was parked : ");
        hours = sc.nextInt();
    }
    void calc() // Method to calculate the total bill of the user
    {
        if(hours <= 2)
        {
            bill = hours*15f;
        }
        if(hours > 2)
            bill = 30 + (hours - 2)*7.5f;
    }
    void disp() // Method to display the final details of the user
    {
        System.out.println("VEHICLE NUMBER  : "+vno);
        System.out.println("HOURS PARKED    : "+hours);
        System.out.println("BILL TO BE PAID : Rs. " +
                ""+bill);
    }
    public static void main(String[] args) // Main method
    {
        ParkingLot pl = new ParkingLot(); //Object Creation
        pl.Input(); // method invocation
        pl.calc();
        pl.disp();
    }
}
