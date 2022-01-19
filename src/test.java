import java.io.*;

public class test{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s="",pat="";
        int flag=0;
        int c=0,j=0;
        System.out.println("Enter a Text in upper case: ");
        s = br.readLine();
        System.out.println("Enter the patter : ");
        pat = br.readLine();
        int[] lps = new int[pat.length()];
        lps[0]=0;
        for(int i=0;i<pat.length() & j<pat.length();i++)
        {
            for( j=i+1;j<pat.length();j++)
            {
                char x = pat.charAt(i);
                char y = pat.charAt(j);
                System.out.println("...x"+x);
                System.out.println("...y"+y);
                if(x==y)
                {
                    c++;
                    System.out.println("....."+c);
                    lps[j] = c;
                    i++;
                    j++;
                    System.out.println("....i"+i);
                    System.out.println("....j"+j);
                }
                else
                {
                    System.out.println("...else");
                    i = lps[i];
                    lps[j]=0;
                    j++;
                }
            }

        }

        for(int i=0;i<pat.length();i++)
        {
            System.out.println(lps[i]);
        }


        /*for(int i=0,j=0;i<s.length();)
        {
            char x = s.charAt(i);
            char y = pat.charAt(j);
            if(x == y)
            {
                i++;
                j++;
            }
            if(j == pat.length())
            {
                System.out.println("Pattern found at "+(i-pat.length()));
                flag = 1;
                j = lps[j-1];
            }
            if(x != y & j==0)
                i++;
            else {
                if (x != y) {
                    j = lps[j - 1];
                }
            }

        }
        if(flag == 0)
        {
            System.out.println("Pattern not found");
        }*/
    }
}