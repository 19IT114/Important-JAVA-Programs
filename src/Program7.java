public class Program7 {
    int factorial(int i)
    {
        int res=1;
        while(i>0)
        {
            res = res * i;
            i--;
        }
        return res;
    }
    public static void main(String a[])
    {
        Program7 p = new Program7();
        int fact = p.factorial(Integer.parseInt(a[0]));
        System.out.println("Factorial of "+a[0]+" is "+fact);
    }
}
