import java.util.*;
class Mycollect
{
    public static void main(String[] args)
    {
        ArrayList<String> aa = new ArrayList<String> ();
        aa.add("ds");
        aa.add("aiml");
        aa.add("iot");
        aa.add("cs");
        aa.add("aiml");
        //aa.add(99);
        System.out.println(aa);
        Iterator k = aa.iterator();
        while (k.hasNext()){
            System.out.println(k.next());
        }
    }
}