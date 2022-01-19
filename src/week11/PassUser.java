import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PassUser {
    public static void main(String[] args) throws IOException {
        FileReader fr =null;
        String pass = "",user ="";
        StringTokenizer str = null;
        int flag = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("USERNAME --> ");
        user = br.readLine();
        System.out.print("PASSWORD --> ");
        pass = br.readLine();

        try
        {
            fr = new FileReader("Output.txt");
            br = new BufferedReader(fr);
            int c=1;
            String line = "";
            while((line = br.readLine()) != null)
            {
                String a[] = new String[2];
                str = new StringTokenizer(line," ,");
                for(int i=0;i<str.countTokens();i++)
                {
                    a[i]  = str.nextToken();
                    System.out.println(a[0]);

                }


                    if (user.equals(a[0]) == false) {
                        System.out.println("Invalid..! Credentials");
                        flag = 1;
                    }


                    if (pass.equals(a[1]) == false) {
                        System.out.println("Invalid..! Credentials");
                        flag = 1; }

                    if(flag == 0)
                    {
                        System.out.println("Login Successfull..!");
                    }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
            fr.close();
        }



    }
}
