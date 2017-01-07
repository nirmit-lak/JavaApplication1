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



public class jcc extends JFrame implements ActionListener{
    JButton b;
    Container c;
    jcc()
    {
        c=this.getContentPane();
        c.setLayout(new FlowLayout());
        b=new JButton("Select a color");
        c.add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        Color selected=null;
        Color color=JColorChooser.showDialog(this,"Select a color",selected);
        if(color!=null)
        {
            selected = color;
        }
        c.setBackground(color);
    }
    public static void main(String args[])
    {
        jcc f=new jcc();
        f.setSize(400,400);
        f.setTitle("nirmit");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}