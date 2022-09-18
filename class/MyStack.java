import java.util.*;

class MyStack {
    public static void main(String[] args) {
        PriorityQueue<String> s = new PriorityQueue<String>();
        s.add("One");
        s.add("Two");
        s.add("Five");

        System.out.println(s.peek());
        System.out.println(s.poll());
        System.out.println(s.peek());
        //System.out.println(s.search("Two"));

        Iterator h = s.iterator();
        
        while(h.hasNext()){
            System.out.println(">"+h.next());
        }
         
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.poll());
        }
        System.out.println(s.peek());
    }
}