import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        boolean found = false;
        int[] a = new int[]{1,2,3,4,5,6};
        int loc = -1;
        int l = a.length;
        System.out.print("Original Array : ");
        for (int i = 0; i <l; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Enter the element you want to delete : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<l;i++)
        {
            if(a[i] == x)
            {
                loc = i;
                found = true;
                break;
            }
        }
        if(found)
        {
            for(int i=loc;i<l-1;i++)
                a[i] = a[i+1];
            l = l-1;
            System.out.print("After removing "+x+", modified array is : ");
            for(int i=0;i<l;i++)
                System.out.print(a[i]+" ");
        }
        else
            System.out.print(x+" not found in the array.");

    }

}
