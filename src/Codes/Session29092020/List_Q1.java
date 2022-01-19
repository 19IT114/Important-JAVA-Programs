package Session29092020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class List_Q1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(20);
        System.out.println(al.size());
        ArrayList<String> al2 = new ArrayList<>();
        al2.add(".");
        al2.add(".");
        al2.add(".");
        al2.add(".");
        al2.add(".");
        al2.add(".");
        al.add("Blue");
        al.add("Green");
        al.add("Yellow");
        al.add("Orange");
        al.add("Cyan");
        al.add("Purple");
        System.out.println(al.indexOf("cyan"));
        int size = al.size();
        System.out.println("Total contents = "+size);
        for (String s:al) { // Iterating through all elements of list and displaying them .
            System.out.print(s+",");
        }
        System.out.println();

        al.add(0,"Red"); // Inserting the new element at the first position
        for (String s:al) { // Iterating through all elements of list and displaying them .
            System.out.print(s+",");
        }
        System.out.println();

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the index of element you want to get : ");
        int index = sc.nextInt();
        try {
            System.out.println("--->" + al.get(index)); // getting the element at specified location
        }
        catch(Exception e)
        {
            System.out.println("Invalid index");
        }

        System.out.println("Enter the element to be replaced : ");
        String Rep = sc.next();
        System.out.println("Enter the index position to be replaced with : ");
        index = sc.nextInt();
        al.set(index,Rep);

        System.out.println("After replacement : -->");
        for (String s:al) { // Iterating through all elements of list and displaying them .
            System.out.print(s+",");
        }
        System.out.println("\n");
        System.out.println("After removing 3 element ");
        al.remove(2); //Removing 3 element from the list
        for (String s:al) { // Iterating through all elements of list and displaying them .
            System.out.print(s+",");
        }
        System.out.println("\n");


        System.out.println("Enter the element you want to search for : ");//Searching for an element in the list
        Rep = sc.next();
        System.out.println(al.contains(Rep)?"element found inside the array list" : "element  not found inside the array list");

        System.out.println("\nSorted array list -->");
        Collections.sort(al); //Sorting the array list
        System.out.println(al);
        System.out.println("\n");

        System.out.println("After copying array list one to second array list");
        Collections.copy(al2,al);
        System.out.println(al2); //Copying one array list to another

        System.out.println("\nAfter shuffling array list->");
        Collections.shuffle(al);//Shuffling the array List
        System.out.println(al+"\n");
        System.out.print("Reverse order -->");
        Collections.reverse(al);//Reversing the order
        System.out.println(al+"\n");

        System.out.println("After Extracting"+al.subList(1,4));//Extraction
        System.out.println("ORIGINAL"+al);

        System.out.println("\n"); //comparing two list
        System.out.println("Comparing elements -- >"+al.equals(al2));


        Collections.swap(al,1,4);
        System.out.println("After Swapping "+al+"\n");
        al2.set(0,"1");
        al2.set(1,"2");
        al2.set(2,"3");
        al2.set(3,"4");
        al2.set(4,"5");
        al2.set(5,"6");
        System.out.println("list 2==>"+al2);
        al.addAll(al2);
        System.out.println("After adding list 2 in list 1 ==> "+al);


        ArrayList al3 = new ArrayList();
        al3 = (ArrayList) al.clone();
        System.out.println("After cloning into al3-->"+al3);
        al3.clear();
        System.out.println("After removing all the elements of al3 ==>"+al3);

        if(al3.size() == 0)
            System.out.println("al3 is empty");
        else
            System.out.println("al3 is not empty");

        System.out.println("Initial size of al ="+al.size());
        al.trimToSize();
        System.out.println("After trimming size==>"+al.size());
        al.ensureCapacity(50);
        System.out.println("Now it can store upto 50 elements");


        System.out.println("Enter the element to be replaced at 2 place");
        Rep = sc.next();
        al.set(1,Rep);

        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+",");
        }

    }
}
