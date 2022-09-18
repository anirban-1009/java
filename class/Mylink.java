import java.util.*;

class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "my roll no. is "+id+" name "+name;
    }
}

class MyLink{
    public static void main(String[] args){
        ArrayList<Student> a1 = new ArrayList<Student>();
        Student s1 = new Student(1, "Ravi");
        Student s2 = new Student(2, "Shakal");

        a1.add(s1);
        a1.add(s2);
        Iterator it = a1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}