package week11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EXE {
    public static void main(String[] args) {
        FileReader fr = null;

        PrintWriter pw  = null;
        String l = "";
        int c = 0;
        try {
            fr = new FileReader("Convert.txt");
            pw = new PrintWriter("Name.xls");

            while ((c=fr.read()) != -1)
            {
                if((char)c == ',')
                {
                    pw.write(l);
                    l="";
                }
                else
                {
                    l += (char) c;
                }
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }
}
