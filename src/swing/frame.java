
package swing;


import java.awt.*;
import javax.swing.*;


public class frame extends JFrame{
    JLabel l;
    frame()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.green);
        l=new JLabel("Hello Learners");
        l.setFont(new Font("Helvetica",Font.BOLD,34));
        l.setForeground(Color.red);
        c.add(l);
    }
    public static void main(String args[])
    {
        frame f=new frame();
        f.setTitle("My swing frame");
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
