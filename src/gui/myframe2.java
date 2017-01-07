package gui;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class myframe2 {
    public static void main(String args[])
    {
        Frame f=new Frame();
        f.setTitle("nirmit");
        f.setSize(1000,700);
        f.setVisible(true);
        f.addWindowListener(new Myclass2());
    }
}
class Myclass2 extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
