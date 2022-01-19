package codechef;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Practice
{
    static int contains(int a[],int x)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0, n = 0, x = 0, p = 0, k = 0;
        try {
            t = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }

        while (t-- > 0) {
            String input[] = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            x = Integer.parseInt(input[1]);
            p = Integer.parseInt(input[2]);
            k = Integer.parseInt(input[3]);

            int a[] = new int[n];
            String elements[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(elements[i]);
            }
            int count = 0;
            Arrays.sort(a);
            if (contains(a, x) == -1) {
                a[k - 1] = x;
                count++;
                Arrays.sort(a);
            }

            if (a[p - 1] == x)
                System.out.println(count);
            else if (p < k) {
                if (a[p - 1] > x) {
                    for (int i = 0; a[p - 1] != x; i++) {
                        count++;
                        a[k - 1] = 0;
                        Arrays.sort(a);
                    }
                    System.out.println(count);
                } else {
                    System.out.println("-1");
                }
            } else if (p > k) {
                if (a[p - 1] < x) {
                    for (int i = 0; a[p - 1] != x; i++) {
                        a[k - 1] = x;
                        count++;
                        Arrays.sort(a);
                    }
                    System.out.println(count);
                } else
                    System.out.println("-1");
            } else {
                count = (int) Math.abs(contains(a, x) - p);
                System.out.println(count);
            }

        }
    }
}