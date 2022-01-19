public class THIS_pro {
    THIS_pro()
    {
        System.out.println("Default Constructor");
    }

    THIS_pro(int i)
    {
        this();
        System.out.println("1 para Constructor");

    }
    void disp()
    {
        System.out.println("display called");
    }

    public static void main(String[] args)
    {
        THIS_pro t = new THIS_pro(2);
    }
}
