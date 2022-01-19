import java.io.*;
import java.util.ArrayList;

public class PracExam {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stud obj[] = new Stud[5];
        ArrayList<Stud> al = new ArrayList<>();
        for(int i=0;i<2;i++)
        {
            System.out.print("Name: ");
            String n = br.readLine();
            System.out.print("Id: ");
            String id = br.readLine();
            System.out.print("Branch: ");
            String b = br.readLine();
            obj[i] = new Stud(n,id,b);
            al.add(obj[i]);
        }

            fw = new FileWriter("StudentInfo.txt");
            for (int i=0;i<2;i++)
            {
                Stud s = al.get(i);
                fw.write(s.name+" "+s.id+" "+s.branch+System.lineSeparator());

            }
        fw.close();

        FileReader reader = null;
        BufferedReader fr = null;
        try {
//reading in the file
           reader = new FileReader("StudentInfo.txt");
           fr = new BufferedReader(reader);
            String s;
            while ((s = fr.readLine()) != null) {
                System.out.println(s);
            }
            reader.close();

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
