import java.io.*;

public class New {
    public static void main(String[] args) {
        FileReader fr  = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            fr = new FileReader("D:\\\\virag essentials\\\\JAVA_CODE\\\\src\\\\Hello.txt");
            fw = new FileWriter("BuffWrite.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            String line = "";
            while((line = br.readLine()) != null)
            {
                System.out.println(line+"...");
                bw.write(line+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
                br.close();
                fw.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
