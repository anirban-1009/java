import java.util.*;
class Even implements Runnable{
    public int x;
    public Even(int x){
        this.x=x;
    }

    public void run(){
        System.out.println("New Thread "+x+" is EVEN and Square of " + x + " is: " +x*x);
    }
}

class Odd implements Runnable{
    public int x;
    public Odd(int x){
        this.x = x;
    }
    public void run(){
        System.out.println("New Thread "+x+" is ODD and cube of "+x+" is: " + x*x*x);
    }
}

class A extends Thread {
    public void run(){
        Random r = new Random();
        try{
            for(int i =0; i<5;i++){
                int num = r.nextInt(100);

                System.out.println("Main Thread and Generated number is " + num);
                if (num%2 ==0){
                    Thread t1 = new Thread(new Even(num));
                    t1.start();
                }
                else{
                    Thread t2 = new Thread(new Odd(num));
                    t2.start();
                }

                Thread.sleep(1000);
                System.out.println("------------------------");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

public class multhr {
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}