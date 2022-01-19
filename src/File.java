import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\virag essentials\\JAVA_CODE\\src\\Hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..! No Such File found");
        }

        int c=0;

            try {
                while((c=fr.read()) != -1)
                {
                    System.out.print((char) c);
                }
            } catch (IOException e) {
                System.out.println("No data Found");
            }
            finally
            {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}
