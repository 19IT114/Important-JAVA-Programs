import com.sun.jdi.event.StepEvent;

interface id_no{
    String id(String s);
}
interface Name{
    String name(String a);
}
public class SP_2 implements id_no,Name {
     public String id(String s)
    {
        return s;
    }
    public String name(String a)
    {
        return a;
    }
}

class Main extends SP_2
{
    public static void main(String[] arf){
        SP_2 S = new SP_2();
        String id = S.id("19it114");
        String n = S.name("VIRAG");
        System.out.println(n+" = "+id);
    }
}
