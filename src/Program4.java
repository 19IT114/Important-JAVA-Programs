public class Program4 {
    int Add(int i,int j)
    {
        return i+j;
    }
    public static void main(String ar[])
    {
        Program4 p = new Program4();

        int a = p.Add(Integer.parseInt(ar[0]),Integer.parseInt(ar[1]));
        System.out.println("Sum is "+a);
    }
}
