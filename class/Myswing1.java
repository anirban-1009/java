import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Myswing1 extends JFrame implements ActionListener{
    JButton b1;
    JTextField t1,t2,t3;
    Myswing1()
    {
        b1 = new JButton("abc");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);

        add(t1);
        add(t2);
        add(t3);
        add(b1);
        b1.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a1)
    {
        try{
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            
            int c = a/b;
            t3.setText("" + c);
        }
        catch(NumberFormatException w){
            JOptionPane.showMessageDialog(null, "U have entered text");
        }

        catch(ArithmeticException w){
            JOptionPane.showMessageDialog(null, "U are trying to divide by zero");
        }
    }

    public static void main(String args[]){
        new Myswing1();
    }
}