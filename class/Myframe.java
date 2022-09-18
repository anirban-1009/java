import java.awt.*;
class Myframe extends Frame
{
    Button b1,b2;
    
    TextField t1;
    Myframe()
    {
        Frame f = new Frame("Aiml Frame");
        Button b = new Button("Click");
        Button b1 = new Button("Submit");
        TextField text = new TextField("Hello!");
        text.setEchoChar('$');
        f.add(text);
        f.add(b1);
        f.add(b);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }
}