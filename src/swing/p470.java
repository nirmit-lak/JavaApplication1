/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing;

/**
 *
 * @author nirmit
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.plaf.*;


public class p470 extends JFrame implements ItemListener{
    JButton b;
    JCheckBox bc1;
    JRadioButton rb1,rb2,rb3;
    JTextField tf;
    ButtonGroup bg;
    Container c;
    p470()
    {
        c=this.getContentPane();
        b=new JButton("Button");
        bc1=new JCheckBox("CheckBox");
        rb1=new JRadioButton("Metal");
        rb2=new JRadioButton("MOtif");
        rb3=new JRadioButton("Windows");
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        b.setBounds(100,50,75,40);
        bc1.setBounds(100,100,100,40);
        tf=new JTextField("TextField",15);
        tf.setBounds(100,150,100,40);
        rb1.setBounds(50,250,100,30);
        rb2.setBounds(150,250,100,30);
        rb3.setBounds(250,250,100,30);
        c.add(b);
        c.add(bc1);
        c.add(rb1);
        c.add(rb2);
        c.add(rb3);
        c.add(tf);
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        try
        {
            if(rb1.getModel().isSelected()) UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            else if(rb2.getModel().isSelected()) UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            else if(rb3.getModel().isSelected()) UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(c);
        }
        catch(Exception ae){}
    }
    public static void main(String args[])
    {
        p470 f=new p470();
        f.setSize(400,400);
        f.setTitle("nirmit");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
