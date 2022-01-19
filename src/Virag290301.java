import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Virag290301 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }



    public static void main(String[] args)
    {
        FastReader s = new FastReader();
        int t = 0;
        try
        {
            t = s.nextInt();
        }
        catch(Exception e)
        {

        }

        while(t-- > 0)
        {
            int n = s.nextInt();
            for(int i=n;i>=2;i-=1)
            {
                int sum = ((n*n)+n)/2;
                if(sum % 2==0)
                {
                    System.out.println(n);
                    break;
                }

            }
        }
    }
}