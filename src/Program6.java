public class Program6 {
    void calc(int i)
    {
        if(i%2 == 0)
            System.out.println(i+" is an even number");
        else
            System.out.println(i+" is an odd number");
    }
    public static void main(String ar[])
    {
        Program6 p = new Program6();

        p.calc(Integer.parseInt(ar[0]));

    }
}
