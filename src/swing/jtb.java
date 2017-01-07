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



public class jtb extends JFrame implements ActionListener{
    String str;
    Container c;
    JToolBar tb;
    JButton b1,b2,b3;
    JLabel lbl;
    jtb()
    {
        c=this.getContentPane();
        c.setLayout(new BorderLayout());
        tb= new JToolBar();
        tb.setBorder(BorderFactory.createEtchedBorder(Color.green,Color.black));
        b1=new JButton();
        b2=new JButton();
        b3=new JButton();
        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        c.add("North",tb);
        lbl=new JLabel();
        c.add("Center",lbl);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
            str="new clicked";
        else if(ae.getSource()==b2)
            str="open clicked";
        else if(ae.getSource()==b3)
            str="print clicked";
        lbl.setText(str);
    }
    public static void main(String args[])
    {
        jtb j=new jtb();
        j.setSize(400,400);
        j.setVisible(true);
        j.setTitle("nirmit");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
