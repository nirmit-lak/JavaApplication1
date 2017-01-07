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



public class _496 extends JFrame implements ActionListener{
    JCheckBox cb1,cb2;
    JRadioButton rb1,rb2;
    JTextArea ta;
    ButtonGroup bg;
    String msg="";
    _496()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        ta=new JTextArea(10,20);
        cb1=new JCheckBox("English");
        cb2=new JCheckBox("Hindi");
        rb1=new JRadioButton("true");
        rb2=new JRadioButton("false");
        bg=new ButtonGroup();
        
        bg.add(rb1);
        bg.add(rb2);
        c.add(cb1);
        c.add(cb2);
        c.add(rb1);
        c.add(rb2);
        c.add(ta);
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(cb1.getModel().isSelected()) msg+="\nEnglish";
        if(cb2.getModel().isSelected()) msg+="\nHindi";
        if(rb1.getModel().isSelected()) msg+="\ntrue";
        else if(rb2.getModel().isSelected()) msg+="\nfalse";
        ta.setText(msg);
        msg="";
    }
    public static void main(String args[])
    {
        _496 f=new _496();
        f.setSize(400,400);
        f.setTitle("nirmit");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
