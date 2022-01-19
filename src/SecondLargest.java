public class SecondLargest {
    public static void main(String[] args)
    {
        int a[] = new int[]{3,9,2,45,8,1,18,17};
        int max = 0;
        int preMax = 0;
        int l = a.length;

        for(int i=0;i<l;i++)
        {
            if(a[i] > max)
            {
                preMax = max;
                max = a[i];
            }
            else
            {
                if(a[i] > preMax)
                    preMax = a[i];
            }
        }

        System.out.println("Second Largest Element is : "+preMax);
    }
}
