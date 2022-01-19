import java.util.Arrays;

public class Similar {
    public static void main(String[] args)
    {
        String[] S1 = new String[]{"Apple","Mango","Cherry","Papaya"};
        String[] S2 = new String[]{"Cabbage","BitterGourd","mango","Papaya","Mint"};

        System.out.println("Array 1 : "+ Arrays.toString(S1));
        System.out.println("Array 2 : "+ Arrays.toString(S2));
        int l1 = S1.length;
        int l2 = S2.length;

        System.out.print("Common Elements are : ");
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(S1[i].equalsIgnoreCase(S2[j]))
                    System.out.print(S1[i]+" ");
            }
        }

    }
}
