package week_10;

public class nested {
    public static void main(String[] args) {
        int[] a ={1,2};
        try{
            try{
                System.out.println(a[5]);
            }
            catch (NullPointerException ae)
            {
                System.out.println("Exception handled inside nested try block");
            }
        }
        catch (Exception x)
        {
            System.out.println("Exception handled inside main try block");
        }
    }
}
