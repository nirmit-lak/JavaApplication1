/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layoutmanager;

/**
 *
 * @author nirmit
 */
import java.awt.*;
import javax.swing.*;




public class hvbox extends JFrame{
    hvbox()
    {
        JLabel l1=new JLabel("Enter Name  :");
        JTextField t1=new JTextField(20);
        t1.setMaximumSize(t1.getPreferredSize());
        Box h1=Box.createHorizontalBox();
        h1.add(l1);
        h1.add(Box.createHorizontalStrut(20));
        h1.add(t1);
        JLabel l2=new JLabel("Enter Password  :");
        //JTextField t2=new JTextField(20);
        JPasswordField t2=new JPasswordField(20);
        t2.setMaximumSize(t2.getPreferredSize());
        Box h2=Box.createHorizontalBox();
        h2.add(l2);
        h2.add(Box.createHorizontalStrut(20));
        h2.add(t2);
        JButton b1=new JButton("OK");
        JButton b2=new JButton("Cancle");
        Box h3=Box.createHorizontalBox();
        h3.add(b1);
        h3.add(Box.createHorizontalGlue());
        h3.add(b2);
        Box v=Box.createVerticalBox();
        v.add(h1);
        v.add(Box.createVerticalStrut(100));
        v.add(h2);
        v.add(Box.createVerticalStrut(100));
        v.add(h3);
        Container c=this.getContentPane();
        c.add(v);
    }
    public static void main(String args[])
    {
        hvbox h=new hvbox();
        h.setSize(400,400);
        h.setVisible(true);
        h.setTitle("Nirmit");
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
