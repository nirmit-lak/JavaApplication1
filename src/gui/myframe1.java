package gui;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Myclass implements WindowListener
{
    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
}
public class myframe1 
{
    public static void main(String args[])
    {
        Frame f=new Frame();
        f.setTitle("my frame");
        f.setSize(300,250);
        f.setVisible(true);
        f.addWindowListener(new Myclass());
    }
}
