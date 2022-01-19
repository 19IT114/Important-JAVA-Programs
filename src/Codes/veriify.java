import java.io.*;
import java.util.*;

class veriify
{
    public static void main(String[] args)throws IOException {
     long t=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     try{
         t = Long.parseLong(br.readLine());
     } catch (Exception e) {
         e.printStackTrace();
     }
     while(t-- > 0)
     {
        boolean flag = false;
        StringTokenizer str = new StringTokenizer(br.readLine());
         long n  = Integer.parseInt(str.nextToken());
         long k  = Integer.parseInt(str.nextToken());
         str = new StringTokenizer(br.readLine());
         ArrayList<Long> a = new ArrayList<Long>();
         for(int i=0;i<n;i++)
         {
             a.add(Long.parseLong(str.nextToken()));
         }
        int i=0;
         while(a.get(i)>=k)
         {
             try {
                     long sum = a.get(i + 1) + (a.get(i) - k);
                     a.set(i + 1, sum);
                 } catch (Exception e) {
                    a.add(a.get(i)-k);
                 }

             i++;
         }
         System.out.println(i+1);

     }
    }
}