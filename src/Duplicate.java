public class Duplicate {
    public static void main(String[] args)
    {   int flag=0;
        int[] a = new int[]{34,5,3,5,6,4,3,2,2,4};
        int[] dup = new int[a.length];
        int c=-1;

        System.out.print("Original Array : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        for(int i=0;i<a.length;i++)
        {   flag=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    flag++;
                    if(flag==1)
                    dup[++c] = a[i];
                }
            }
        }
        System.out.print("Duplicate values are : ");
        if(c != -1)
        {
            for (int i = 0;i <= c; i++)
                System.out.print(dup[i] + " ");
        }
        else
            System.out.println("No Duplicates found..!!");
    }
}
