package Day5;
import java.util.Scanner;
public class signifiacntbit {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("N1 = ");
        int n = sc.nextInt();
        String bin = Integer.toBinaryString(n);
        System.out.println("Significant bit = "+(int)Math.pow(2,bin.length()-1));
    }

}
