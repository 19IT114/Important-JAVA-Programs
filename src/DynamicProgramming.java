import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class DynamicProgramming {
    int[] values = new int[100];
    int NIL = -1;
    void initialise() {
        for (int i = 0; i < 100; i++)
            values[i] = NIL;
    }
//    int fib(int n) --> RECURSIVE
//    {
//        if(n<=1)
//            return n;
//        else
//            return fib(n-2)+fib(n-1);
//    }

//    int fib(int n)--> TABULATION
//    {
//        int[] f = new int[n+1];
//        f[0] = 0;
//        f[1] = 1;
//        for (int i =2;i<=n;i++) {
//            f[i]  = f[i-2]+f[i-1];
//        }
//        return f[n];
//    }
        int fib(int n)
        {
            if(values[n] == NIL)
            {
                if(n<=1)
                    values[n] = n;
                else
                    values[n] = fib(n-2)+fib(n-1);
            }
            return values[n];
        }

    public static void main(String[] args)
    {
        DynamicProgramming dp = new DynamicProgramming();
        dp.initialise();
        System.out.println(dp.fib(40));
    }
}
