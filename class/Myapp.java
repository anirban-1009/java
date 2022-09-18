import java.applet.*;
/*<applet code="Myapp" width=400
 height=400>
 </applet>
*/


public class Myapp extends Applet{
    public void init()
    {
        System.out.println("init");
    }
    public void start()
    {
        System.out.println("strat");
    }
    public void stop(){
       System.out.println("stop"); 
    }
    public void destroy(){
        System.out.println("Destroy");
    }
}