package week11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Count {
    public static void main(String[] args) {
        int chr = 0,ln=0,wd=0;
        FileReader fr = null;
        BufferedReader br = null;
        StringTokenizer str = null;



        try {
            fr = new FileReader("D:\\virag essentials\\JAVA_CODE\\src\\Hello.txt");
            br = new BufferedReader(fr);
            String line ="";
            while ((line=br.readLine()) != null)
            {
                ln++;
                char[] a = line.toCharArray();
                str = new StringTokenizer(line," ,.!?");
                wd += str.countTokens();
                chr += a.length;
            }
            System.out.println("Total characters = "+chr);
            System.out.println("Total lines = "+ln);
            System.out.println("Total words = "+wd);

        } catch (IOException e) {
            System.out.println("OOps....!! No such file found..");
        }
    }
}
