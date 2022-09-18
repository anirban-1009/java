import java.awt.*;
import java.awt.event.*;
class Actionlisten extends Frame implements ActionListener{
    Button b1;
    TextField t1,t2,t3;
    Label l1;
    Actionlisten()
    {
        t1 = new TextField(20);
        t2 = new TextField(5);
        t3 = new TextField(20);
        b1 = new Button("calculate");
        l1 = new Label("First label");
        setLayout(new FlowLayout());
        
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(l1);
        b1.addActionListener(this);
        l1.setAlignment(Label.CENTER);
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent q){
        // int f = Integer.parseInt(t1.getText());
        // int f1 = Integer.parseInt(t3.getText());
        // int result;
        // String res;
        // if(t2.getText() == "+"){
        //     result = f+f1;
        //     res = Integer.toString(result);
        //     l1.setText(res);
        // }
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
    }

    public static void main(String args[]){
        Actionlisten gg = new Actionlisten();
    }
}