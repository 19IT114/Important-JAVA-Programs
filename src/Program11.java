public class Program11 {
    public static void main(String a[])
    {
        Program11 p = new Program11();
        int i = Integer.parseInt(a[0]);
        int j=0;
        if(i==12 | i==1 | i==2)
            j=1;
        else if(i==3 | i==4 | i==5)
            j=2;
        else if(i==6 | i==7 | i==8)
            j=3;
        else if(i==9 | i==10 | i==11)
            j=4;
        else
            j=0;

        switch(i)
        {
            case 1,2,12:
            {
                System.out.println("Winter");
                break;
            }
            case 3,4,5:
            {
                System.out.println("Spring");
                break;
            }
            case 6,7,8:
            {
                System.out.println("Summer");
                break;
            }
            case 9,10,11:
            {
                System.out.println("Autumn");
                break;
            }
            default:
            {
                System.out.println("Invalid input..!");
                break;
            }
        }
    }
}
