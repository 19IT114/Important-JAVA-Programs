public class Program8 {
    void Largest(int i,int j,int k)
    {
        if(i>j)
        {
            if(i>k)
            {
                System.out.println(i+" is the largest");
            }
        }
        else
        {
            if(j>k)
            {
                System.out.println(j+" is the largest");
            }
            else
                System.out.println(k+" is the largest");
        }
    }

    public static void main(String a[])
    {
        Program8 p = new Program8();
        p.Largest(Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2]));
    }
}
