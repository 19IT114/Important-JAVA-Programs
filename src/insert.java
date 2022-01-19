import java.util.Scanner;

public class insert {
    public static void main(String[] args)
    {
        int j = -1;
        int a[] = new int[]{1,2,3,4,5,6,8,9};
        int b[] = new int[a.length+1];

        System.out.print("Original array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to insert : ");
        int x = sc.nextInt();
        System.out.print("Enter the position where you want to insert : ");
        int pos = sc.nextInt();
        int ind = pos-1;
        if(ind>=0 & ind<=a.length) {
            for (int i = 0; i < b.length; i++) {
                if (i == ind)
                    b[i] = x;
                else
                    b[i] = a[++j];
            }


            System.out.print("New array after inserting " + x + " : ");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
        }
        else
            System.out.println("Insertion not possible");
    }
}
