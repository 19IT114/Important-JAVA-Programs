import java.util.Random;
import java.util.Scanner;

class CaptchaGenerator
{
    String getCaptcha(int l)
    {
        String Captcha = "";
        String eligibleChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char a[] = eligibleChar.toCharArray();

        Random ran = new Random();

        for(int i=0;i<l;i++)
        {
            Captcha = Captcha + a[ran.nextInt(62)];
        }
        return Captcha;
    }

    public static void main(String[] args)
    {
        CaptchaGenerator cg = new CaptchaGenerator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Captcha that you need to generate : ");
        int n = sc.nextInt();
        System.out.println("Captcha --> "+cg.getCaptcha(n));
    }
}
