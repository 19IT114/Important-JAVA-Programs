public class Max_Min {
    public static void main(String[] args)
    {
        int[] a = new int[]{34,5,3,5,6,4,3,2,2,4,125,0,-5};

        int max=0,min=0;

        for(int i=0;i<a.length;i++)
        {
                if(i==0)
                {
                    max = a[i];
                    min = a[i];
                }

                if(a[i] > max)
                    max = a[i];

                if(a[i] < min)
                    min = a[i];

        }
        System.out.println("Maximum element : "+max);
        System.out.println("Minimum element : "+min);
    }
}
