package codechef;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void generate(ArrayList<Integer> arr, int x,int p,int k)
    {
        int count=0;
        Random r = new Random();
        while (arr.indexOf(x) != p - 1) {
            arr.set(k - 1, r.nextInt(x));
            count++;
            Collections.sort(arr);
        }
        System.out.println(count);

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = new String[4];
        int t=0;
        try{
            t = Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {}
        while(t-- > 0)
        {
            s = br.readLine().split(" ");
            int n=0,x=0,p=0,k=0;
            try{
                n = Integer.parseInt(s[0]);
                x = Integer.parseInt(s[1]);
                p = Integer.parseInt(s[2]);
                k = Integer.parseInt(s[3]);
            }
            catch(Exception e)
            {
            }


            String elements[] = (br.readLine().split(" "));
            int el[] = new int[elements.length];
            for(int i=0;i<elements.length;i++)
            {
                el[i] = Integer.parseInt(elements[i]);
            }
            ArrayList<Integer> a = new ArrayList<>();
            for (int i:el) {
                a.add(i);
            }
            Collections.sort(a);

            if(k>n | p>n){
                System.out.println("-1");
                continue;
            }
            if(!(a.contains(x)))
            {
                try{
                    a.set(k-1,x);
                }
                catch(Exception e){}
                Collections.sort(a);
            }
            if(a.indexOf(x) == p-1) {
                System.out.println("0");
                continue;
            }
            else
            {
                if(a.indexOf(x) > p-1){
                    System.out.println("-1");
                    continue;
                }
                else if(a.indexOf(x)==k-1){
                    System.out.println("0");
                    continue;
                }
            }
            generate(a,x,p,k);
        }
    }
}
