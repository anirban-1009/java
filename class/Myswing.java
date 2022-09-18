import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;

class Myswing extends JFrame{
    JButton b1,b2;
    Myswing()
    {
        b1 = new JButton("abc");
        b2 = new JButton("def");
        add(b1);
        add(b2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());//JoptionPane
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String args[]) {
        new Myswing();        
    }
}
