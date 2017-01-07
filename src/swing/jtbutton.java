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
import javax.swing.event.*;
import java.awt.event.*;


public class jtbutton extends JFrame implements ActionListener{
    JToggleButton but;
    ImageIcon img1;
    jtbutton()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        img1= new ImageIcon("D:\\animated gif\\email.gif");
        but=new JToggleButton("start/stop");
        but.setIcon(img1);
        c.add(but);
        but.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        ImageIcon img2=new ImageIcon("D:\\animated gif\\email.gif");
        if(but.isSelected())
            but.setIcon(img2);
        else but.setIcon(img1);
    }
        
    public static void main(String args[])
    {
        jtbutton f=new jtbutton();
        f.setSize(500,400);
        f.setTitle("nirmit");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
