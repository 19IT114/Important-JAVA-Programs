package aarjav;

import java.util.ArrayList;

public class JavaPackageArrayList {
    public static void main(String[] args) {
        ArrayList<String> pnames = new ArrayList<>();

        pnames.add("java.awt");
        pnames.add("java.lang");
        pnames.add("javax.crypto");
        pnames.add("java.swing");
        pnames.add("java.swing");
        pnames.add("java.net");
        pnames.add("java.io");
        pnames.add("java.util");
        pnames.add("java.util");
        pnames.add("java.sql");
        pnames.add("java.time");
        pnames.add("java.time.zone");
        pnames.add("java.util.zip");
        pnames.add("java.text");
        pnames.add("java.rmi");
        pnames.add("java.nio");
        pnames.add("java.nio");
        pnames.add("java.nio");

        for (String s:pnames) {
            System.out.println(s);
        }

        ArrayList<String> datatypes = new ArrayList<>();
        datatypes.add("boolean");
        datatypes.add("char");
        datatypes.add("float");
        datatypes.add("double");
        datatypes.add("long");
        datatypes.add("int");
        datatypes.add("short");

        pnames.addAll(datatypes);

        System.out.println("Size of new ArrayList --> "+pnames.size());













    }
}
