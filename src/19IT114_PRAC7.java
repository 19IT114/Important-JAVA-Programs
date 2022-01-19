import javax.sql.rowset.BaseRowSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

class FACT {
    private int fact;
    static int s[];
    FACT()
    {
        fact = 0;
        s = new  int[1000];
    }

    int COMPUTE_FACT(int n)
    {
        s[0]=1;
        for(int i=1;i<=n;i++)
        {
            s[i] = s[i-1]*i;
        }
        return s[n];
    }
}

class FACTORIAL
{
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n;
    boolean again = true;
        while(again)
        {
            System.out.print("Enter a number for calculating the Factorial : ");
            n= Integer.parseInt(br.readLine());
            FACT f = new FACT();
            int ans = f.COMPUTE_FACT(n);
            System.out.println(n+"! = "+ans);
            System.out.print("DO YOU WANT TO CALCULATE FACTORIAL OF OTHER NUMBER? [YES (Y)/NO (N)] --> ");
            char choice = br.readLine().charAt(0);
            if(Character.toUpperCase(choice) == 'Y')
                again = true;
            else
                again = false;
        }

    }
}
