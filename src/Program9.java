public class Program9 {
    void swap(int i,int j)
    {
        i = i^j;
        j = j^i;
        i = i^j;
        System.out.println("After Swapping  a="+i+" b="+j);
    }

    public static void main(String ar[])
    {
        Program9 p = new Program9();
        int a = Integer.parseInt(ar[0]);
        int b = Integer.parseInt(ar[1]);
        System.out.println("Before Swapping a="+a+" b="+b);
        p.swap(a,b);
    }
}
