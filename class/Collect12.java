import java.util.*;
class Collect12 {
    public static void main(String[] args){
        ArrayList<Integer> j = new ArrayList<Integer>();
        j.add(886);
        j.add(88);
        j.add(56);
        Iterator u = j.iterator();
        while(u.hasNext()){
            System.out.println(u.next());
            for(int i = 0; i < j.size(); i++){
                System.out.println(j.get(i));
            }
            for(Integer y: j){
                System.out.println(y);
            }
        }
        ArrayList<Integer> j1 = new ArrayList<Integer>();
        j1.add(88888);
        j1.add(67);
        j.addAll(j1);
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("type");
        //Vector<>;

    }
}