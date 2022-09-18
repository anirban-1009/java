import java.applet.*;
import java.awt.*;
public class ex2 extends Applet{
    public void paint(Graphics g){
        setForeground(Color.blue);
        setBackground(Color.pink);
        g.drawString("Welcome to applet", 50, 50);
    }
}

/*<applet code="ex2" width=300 height=300> </applet> */