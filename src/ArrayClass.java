import java.util.Arrays;
public class ArrayClass {
    public static void main(String[] args)
    {
        int[] a = {25,14,19,18,26,4,30};
        int[] b = {4,2,19,18,57,30,58};
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("After Sorting a : " + Arrays.toString(a));
        System.out.println("After Sorting b : " + Arrays.toString(b));

        System.out.println("equal or not : "+Arrays.equals(a,b));
        System.out.println("On comparing : "+Arrays.compare(a,b));
        System.out.println("Array after copy of : "+Arrays.toString(Arrays.copyOf(a,10)));
        System.out.println("After creating a array of certain range from array B : "+Arrays.toString(Arrays.copyOfRange(b,1,4)));
        System.out.println("Searching 26 into array a : 26 found at index "+Arrays.binarySearch(a,26));
        System.out.println("Searching 14 into particular range (0,2) :14 found at index "+Arrays.binarySearch(a,0,2,14));
    }
}
