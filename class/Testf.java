import java.awt.*;
public class Testf extends Frame{
    Button b1, b2;
    Testf(){
        b1 = new Button("click");
        b2 = new Button("Hit");
        b1.setBounds(100, 100, 80, 20);
        b2.setBounds(100,200,80,20);
        add(b1);
        add(b2);
        setLayout(null);
        setSize(300, 500);
        setBackground(Color.green);
        //setForeground(Color.black);
        setVisible(true);
    }
    public static void main(String args[]){
        Testf gg = new Testf();
        System.out.println(gg);
    }
}
