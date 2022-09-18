import java.util.*;
class Aiml{
    int subj, strength;
    String classteacher;
    Aiml(int subj, int strength, String classteacher){
        this.subj = subj;
        this.strength = strength;
        this.classteacher = classteacher;
    }
}



class Mycollect1{
    public static void main(String[] args){
        Aiml a1 = new Aiml(5,64,"Swathy");
        ArrayList<Aiml> aa = new ArrayList<Aiml>();
        aa.add(a1);
        Iterator k = aa.iterator();
        while(k.hasNext()){
            Aiml j = (Aiml)k.next();
            System.out.println(j.strength);
            System.out.println(j.subj);
            System.out.println(j.classteacher);
        }
    }
}