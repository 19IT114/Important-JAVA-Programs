package Session29092020;

import com.sun.source.tree.Tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.IllegalCharsetNameException;
import java.sql.SQLOutput;
import java.util.*;

public class List_Q4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(24, "Virag");
        tm.put(2, "Shrey");
        tm.put(80, "Bholu");
        tm.put(4, "Rahul");
        tm.put(5, "Kamlesh");
        System.out.println("Successfully created a tree map -->" + tm + "\n");
        tm.put(76,"Virag");
        TreeMap<Integer, String> tm_copy = new TreeMap<>();
        tm_copy.putAll(tm);
        System.out.println("Copied main Tree Map to other --> tm_copy = " + tm_copy + "\n");

        System.out.print("Enter a key to be searched -->");
        int s = Integer.parseInt(br.readLine());
        if (tm.containsKey(s))
            System.out.println(s + " found with mapping --> " + tm.get(s) + "\n");
        else {
            System.out.println(s + " not found" + "\n");

        }

        System.out.print("Enter a Value to be searched -->");
        String val = br.readLine();
        if (tm.containsValue(val))
            System.out.println(val + " found" + "\n");
        else
            System.out.println(val + " not found " + "\n");


        System.out.println("All the keys of the map (tm) are --> " + tm.keySet() + "\n");
        tm_copy.clear();
        System.out.println("After removing all the elements from the tree map tm_copy --> " + tm_copy);

        Comparator comp = tm.comparator();
        System.out.println("Comparator value --> " + comp + "\n");

        System.out.println("Key-Value pair with least key --> " + tm.firstEntry());
        System.out.println("Key-Value pair with greatest key --> " + tm.lastEntry() + "\n");

        System.out.println("Least key of map -->" + tm.firstKey());
        System.out.println("Greatest key of map -->" + tm.lastKey()+"\n");
        System.out.println("Original order of Keys -->"+tm.keySet());
        System.out.println("Reverse order of keys --> "+tm.descendingKeySet()+"\n");

        System.out.print("Enter the key to get a key-value mapping associated with the greatest key less than or equal to the given key. -->");int gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output --> "+tm.floorEntry(gk)+"\n");

        System.out.print("Enter a key to get the greatest key less than or equal to the given key-->");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output --> "+tm.floorKey(gk));



        System.out.print("Enter a key to get the portion of a map whose keys are strictly less than a given key-->");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output --> "+tm.headMap(gk)+"\n");

        System.out.print("Enter a key to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.-->");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output --> "+tm.headMap(gk,gk%2==0)+"\n");

        System.out.print("Enter a key to get the least key strictly greater than the given key--> ");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output -->"+tm.higherKey(gk)+"\n");

        System.out.print("Enter a key to get a key-value mapping associated with the greatest key strictly less than the given key--> ");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output -->"+tm.lowerEntry(gk)+"\n");

        System.out.print("Enter a key  to get the greatest key strictly less than the given key.--> ");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output --> "+tm.lowerKey(gk)+"\n");

        System.out.println("Here's a Navigable Set view of the keys present in the map -->"+tm.navigableKeySet()+"\n");

        System.out.println("Least element  --> "+tm.pollFirstEntry());
        System.out.println("After removing, map --> "+tm+"\n");

        System.out.println("Greatest element  -->"+tm.pollLastEntry());
        System.out.println("After removing, map --> "+tm+"\n");

        System.out.println("Enter two keys to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)--> ");gk= Integer.parseInt(br.readLine());int gk1= Integer.parseInt(br.readLine());
        System.out.println("Required Output --> "+tm.subMap(gk,gk1)+"\n");

        System.out.println("Enter two keys to get the portion of a map whose keys range from a given key to another key --> ");gk= Integer.parseInt(br.readLine());gk1= Integer.parseInt(br.readLine());
        System.out.println("Required Output --> "+tm.subMap(gk,true,gk1,true)+"\n");

        System.out.println("Enter a key  to get a portion of a map whose keys are greater than or equal to a given key--> ");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output --> "+tm.tailMap(gk)+"\n");
        System.out.println("Enter a key  to get a portion of a map whose keys are greater a given key--> ");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output --> "+tm.tailMap(gk,false)+"\n");

        System.out.print("Enter a key to get a key-value mapping associated with the least key greater than or equal to the given key--> ");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output -->"+tm.higherEntry(gk)+"\n");
        System.out.print("Enter a key to get the least key greater than or equal to the given key--> ");gk = Integer.parseInt(br.readLine());
        System.out.println("Required Output -->"+tm.higherKey(gk)+"\n");


    }


    }

