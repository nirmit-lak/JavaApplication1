package gui;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Draw1 extends Frame {
    Draw1()
    {
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics d)
    {
        d.setColor(Color.blue);
        d.drawRect(40, 40, 200, 200);
        d.drawOval(90,70,80,80);
        d.drawOval(110,95,5,5);
        d.drawOval(145,95,5,5);
        d.drawLine(130,95,130,115);
        d.drawArc(113,115,35,20,0,-180);
    }
    public static void main(String args[])
    {
        Draw1 d=new Draw1();
        d.setTitle("nirmit");
        d.setSize(400,400);
        d.setVisible(true);
           
    }
}
