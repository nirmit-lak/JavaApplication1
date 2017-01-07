package gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class message extends Frame{
    message()
    {
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g)
    {
        this.setBackground(Color.black);
        Font f=new Font("Algerian",Font.ITALIC,30);
        g.setColor(Color.red);
        g.setFont(f);
        g.drawString("Nirmit Maheshwari",200,100);
    }
    public static void main(String args[])
    {
        message m=new message();
        m.setSize(700,600);
        m.setTitle("nirmit");
        m.setVisible(true);
    }
}
