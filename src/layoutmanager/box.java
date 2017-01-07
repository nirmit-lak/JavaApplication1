package layoutmanager;
import java.awt.*;
import javax.swing.*;
class mypanel1 extends JPanel
{
    mypanel1()
            {
                BoxLayout box1=new BoxLayout(this,BoxLayout.X_AXIS);
                setLayout(box1);
                JButton b1=new JButton("Button 1");
                JButton b2=new JButton("Button 2");
                JButton b3=new JButton("Button 3");
                this.add(b1);
                add(b2);
                add(b3);
            }
}
class mypanel2 extends JPanel
{
    mypanel2()
    {
        BoxLayout box=new BoxLayout(this,BoxLayout.Y_AXIS);
        setLayout(box);
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        add(b1);
        add(b2);
        add(b3);
    }
}
public class box extends JFrame
{
    box()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        mypanel1 mp1=new mypanel1();
        c.add(mp1);
        mypanel2 mp2=new mypanel2();
        c.add(mp2);
    }    
    public static void main(String args[])
    {
        box b=new box();
        b.setSize(400,400);
        b.setVisible(true);
        b.setTitle("nirmit");
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}