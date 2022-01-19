import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VRC {
    static char isevenparity(String a)
    {
        int count = 0;
        int len = a.length();
        for(int i=0;i<len;i++)
        {
            if(a.charAt(i) == '1')
                count++;
        }
        if(count%2 == 0)
            return '0';
        else
            return '1';
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Data Word to be Sent : ");
        String dw = br.readLine();
        dw = dw + isevenparity(dw);

        System.out.print("Enter the Recieved data : ");
        String rd = br.readLine();
        System.out.println("Data word with parity --> "+dw);
        if(rd.charAt(rd.length()-1) == isevenparity(rd.substring(0,rd.length()-1)))
        {
            System.out.println("Data Accepted");
        }
        else
        {
            System.out.println("Data Rejected");
        }


    }
}
