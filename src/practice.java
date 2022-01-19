import java.io.IOException;

public class practice
{
        void me() throws ArithmeticException
        {
            try
            {
                System.out.println(5/0);
            }
            finally {
                System.out.println( "Inside Finally");
            }
        }

    public static void main(String[] args) throws ArithmeticException
    {
        practice p =new practice();

        try
        {
            p.me();
        }
        catch(Exception e)
        {
            System.out.println("Caught an exception --> "+e);
        }
    }
}