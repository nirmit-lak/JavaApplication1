
package gui;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class myradio extends Frame implements ItemListener{
    String msg="";
    CheckboxGroup cbg;
    Checkbox c1,c2;
    myradio()
    {
        setLayout(new FlowLayout());
        cbg=new CheckboxGroup();
        c1=new Checkbox("yes",cbg,false);
        c2=new Checkbox("No",cbg,false);
        this.add(c1);
        this.add(c2);
        c1.addItemListener(this);
        c2.addItemListener(this);
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
        msg="Current selection: ";
        msg=msg+cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 10,100);
    }
    public static void main(String args[])
    {
        
        myradio r=new myradio();
        try
        {
        r.setTitle("my radio button");
        r.setSize(400,400);
        r.setVisible(true);
        }
        catch(Exception e)
        {
            
        }
    }
}
