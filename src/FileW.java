import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileW {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("D:\\virag essentials\\JAVA_CODE\\src\\Hello.txt");
            fw = new FileWriter("Output.txt");
            int c=0;
            while((c = fr.read()) != -1)
            {
                fw.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
