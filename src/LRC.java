
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LRC {
    public static void main(String[] args)throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of frames you would like to enter : ");
        int row = Integer.parseInt(br.readLine());
        System.out.print("Enter the maximum number of bits : ");
        int col = Integer.parseInt(br.readLine());
        char[][] a = new char[row+1][col];
        System.out.println("Enter the frames one by one : ");
        for(int i=0;i<row;i++)
        {
            System.out.print((i+1)+" : ");
            String x = br.readLine();
            if(x.length() > col)
            {
                System.out.println("INVALID INPUT...!\n ****Number of bits exceeding "+col+" ****");
                return;
            }
            for(int c=0;c<x.length();c++)
            {
                if (x.charAt(c) == '0')
                    continue;
                else if (x.charAt(c) == '1')
                    continue;
                else
                {
                    System.out.println("INVALAID FRAME. FRAME MUST ONLY CONTAIN 1 AND 0");
                    System.out.println("EXITING THE PROGRAM...!");
                    return;
                }
            }
            while(x.length() != col)
                x = "0"+x;
            char[] y = x.toCharArray();

            for(int j=0;j<col;j++)
            {
                a[i][j] = y[j];
            }
        }
//        for (int i=0;i<row;i++)
//        {
//            for(int j=0;j<col;j++)
//            {
//                System.out.print(a[i][j]);
//            }
//
//                System.out.println();
//        }



        for(int j=0;j<col;j++)
        {
            for(int i=0;i<row;i++)
            {
                if(a[i][j] == '1')
                {
                    count++;
                }
            }
            if(count % 2 == 0)
                a[row][j] = '0';
            else
                a[row][j] = '1';
            count = 0;
        }
        System.out.println();
        for (int i=0;i<row+1;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            if(i==row)
                System.out.println(" ----------> ADDITIONAL FRAME");
            else
            System.out.println("");
        }
    }
}
