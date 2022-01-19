import java.util.Arrays;

public class Sort {
    public static void main(String[] args)
    {
        int a[] = {5,9,4,3,7,1};
        String name[] = {"Hello","How","Acknowledge","Great","Bob","Orange"};
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i] < a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("\nSorted Array : ");
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("\n");

        for (int i =0;i<name.length;i++)
            System.out.print(name[i]+" ");


        for(int i=0;i<name.length;i++)
        {
            for(int j=0;j<name.length;j++)
            {
                if(name[j].compareTo(name[i]) > 0)
                {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }


        System.out.print("\nSorted Array : ");
        for (int i =0;i<name.length;i++)
            System.out.print(name[i]+" ");
    }
}

