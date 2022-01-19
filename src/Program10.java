public class Program10 {
    public static void main(String a[])
    {
        int n = Integer.parseInt(a[0]);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
