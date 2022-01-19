import java.util.InputMismatchException;
import java.util.Scanner;

class FACT1 {

    private int fct;

    public FACT1() {
        fct = 1;
    }

    public int COMPUTE_FACT(int n) {

        for (int i = 1; i <= n; i++) {

            fct = fct * i;
        }
        return fct;

    }
}

class FACTORIA {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 0;
        int flag = 0;
        int x=1;
        start:
        while (x == 1)
        {
            x=0;
            System.out.println();
            System.out.println("Enter N: ");
            try {
                N = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Invalid Input");
                sc.next();
                x=1;
                continue;
            }
                if (N > 0) {
                    FACT1 f = new FACT1();
                    System.out.println("Factorial : " + f.COMPUTE_FACT(N));
                    System.out.println();
                } else if (N == 0) {
                    System.out.println("Factorial : 1");
                } else {
                    System.out.println("Negative numbers not allowed");
                }
            System.out.println("Enter 1 to continue :");
            x = sc.nextInt();

        }

    }

}

