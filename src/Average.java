import java.util.Scanner;

public class Average {
    String name[] = new String[50]; // Array for storing the names of 50 students
    int m1,m2,m3,maxindex; // variables for storing three subjects marks and max. average scoring student index
    float avg,maxav = 0f; // variables for storing avg marks and max. average marks.

    void calc() // method to calculate the max. average marks of a student
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("Name of Student : ");
            name[i] = sc.next(); // Accepting Student name

            System.out.println("Enter three subject marks (Out of 50): ");
            m1 = sc.nextInt(); // Marks of three Subjects
            m2 = sc.nextInt();
            m3 = sc.nextInt();
            avg = (m1+m2+m3)/3f; // Calculating average of 3 Subjects

            if(avg > maxav) // Checking for max average marks
            {
                maxav = avg;
                maxindex = i; // Storing index of max. average scoring student
            }
        }

    }

    void display() // Method to display the max average scoring student
    {
        System.out.println(name[maxindex]+" has scored the highest average of "+maxav+" marks");
    }

    public static void main(String[] args) // main method
     {
        Average a = new Average(); // Object creation
        a.calc(); // method invocation
        a.display();
    }
}
