package gui;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class mycheckbox extends Frame implements ItemListener
{
    String str="";
    Checkbox c1,c2,c3;
    mycheckbox()
    {
        setLayout(new FlowLayout());
        c1=new Checkbox("Bold");
        c2=new Checkbox("Italic");
        c3=new Checkbox("Underline");
        this.add(c1);
        this.add(c2);
        this.add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent a)
            {
                System.exit(0);
            }
        });
    }
        public void itemStateChanged(ItemEvent e)
        {
            repaint();
        }
        public void paint(Graphics g)
        {
            g.drawString("Current state: ",10,100);
            str="Bold: "+c1.getState();
            g.drawString(str,10,120);
            str="Italic: "+c2.getState();
            g.drawString(str, 10,140);
            str="Underline: "+c3.getState();
            g.drawString(str,10,160);
        }
        public static void main(String args[])
        {
            mycheckbox mc=new mycheckbox();
            mc.setTitle("My Checkbox");
            mc.setSize(400,400);
            mc.setVisible(true);
        }
}