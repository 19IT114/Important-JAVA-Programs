//package
//import Codes.Session22092020.*;
//import java.io.*;
//import java.util.*;
//
//public class List_Q2 {
//    public static void main(String[] args) {
//        FileReader fr = null;
//        String[] line = null;
//        int count = 1;
//        BufferedReader br = null;
//        Map<Integer, Session29092020.Student> m = new HashMap<Integer,Student>();
//        try {
//            fr = new FileReader("D:\\virag essentials\\Codes\\src\\info.txt");
//            br = new BufferedReader(fr);
//            String g = null;
//            while((g=br.readLine()) != null) {
//                line = g.split(",");
//                m.put(count++, new Student(line[0],line[1],line[2]));
//            }
//        } catch (Exception e) {
//            System.out.println(e.getCause());
//        }
//        for (Map.Entry<Integer,Student> me: m.entrySet()) {
//            Student s = me.getValue();
//
//            System.out.println(me.getKey()+" "+s.id+" "+s.name+" "+s.Inst);
//        }
//
//    }
//}
