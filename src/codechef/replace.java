//package codechef;/* package codechef; // don't place package name! */
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class replace
//{
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s[] = new String[4];
//        int t=0;
//        try{
//            t = Integer.parseInt(br.readLine());
//        }
//        catch(Exception e)
//        {}
//        while(t-- > 0)
//        {
//            s = br.readLine().split(" ");
//            int n=0,x=0,p=0,k=0;
//            try{
//                n = Integer.parseInt(s[0]);
//                x = Integer.parseInt(s[1]);
//                p = Integer.parseInt(s[2]);
//                k = Integer.parseInt(s[3]);
//            }
//            catch(Exception e)
//            {
//            }
//
//
//            String elements[] = (br.readLine().split(" "));
//            int ar[] = new int[n];
//            for(int i=0;i<n;i++)
//            {
//                ar[i] = Integer.parseInt(elements[i]);
//            }
//
//            Arrays.sort(ar);
//            if(k>n | p>n){
//                System.out.println("-1");
//                continue;
//            }
//            if(ar)
//            {
//                try{
//                  ar[k-1] = x;
//                }
//                catch(Exception e){}
//                Arrays.sort(ar);
//            }
//            if(ar.indexOf(x) == p-1) {
//                System.out.println("0");
//                continue;
//            }
//            else
//            {
//                if(ar.indexOf(x) > p-1){
//                    System.out.println("-1");
//                    continue;
//                }
//                else if(ar.indexOf(x)==k-1){
//                    System.out.println("0");
//                    continue;
//                }
//            }
//            {
//                int count=0;
//                Random r = new Random();
//                while (ar.indexOf(x) != p - 1) {
//                    ar[k-1] = r.nextInt(x);
//                    count++;
//                    Arrays.sort(ar);
//                }
//                System.out.println(count);
//            }
//
//        }
//    }
//}
