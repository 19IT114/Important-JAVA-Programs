package week_10;

public class UserDefined {
    public static void main(String[] args) {
        try{
            throw new UserDefinedException("Hello");
        } catch (UserDefinedException e) {
            System.out.println(e);
        }
    }
}
