public class Reverse {
    public static void main(String[] args)
    {
        int a[] = {5,9,4,3,0,-5,7,1,2};
        int l = a.length;

        System.out.print("Original array : ");
        for(int i=0;i<l;i++)
            System.out.print(a[i]+" ");
        System.out.println();

        for(int i=0;i<l/2;i++)
        {
            int temp = a[i];
            a[i] = a[l-1-i];
            a[l-1-i] = temp;
        }

        System.out.print("Array after reversing : ");
        for(int i=0;i<l;i++)
            System.out.print(a[i]+" ");
    }
}

