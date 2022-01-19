public class inherit {
    int x = 10;
    int y = 6;

    int add(int a, int b)
    {
        return (a+b);
    }

    int mul(int a,int b)
    {
        return a*b;
    }
}

class Odd extends inherit
{
    int c = 4;
    int d = 5;
    int sub(int a , int b)
    {
        return (a-b);
    }

    int mod(int a,int b)
    {
        return a%b;
    }

    public static void main(String[] args)
    {
        Odd o = new Odd();
        System.out.println(o.sub(2,3));
        System.out.println(o.add(5,6));
        System.out.println(o.mul(5,4));
        System.out.println(o.mod(8,4));
        System.out.println(o.x);
        System.out.println(o.y);
    }
}
