/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class hello extends JFrame implements ActionListener{
    JButton b;
    JLabel l;
    hello()
    {
        Container c=this.getContentPane();
        ImageIcon ii=new ImageIcon("D:\\animated gif\\email.gif");
        c.setLayout(new FlowLayout());
        b=new JButton("Click me",ii);
        b.setBackground(Color.yellow);
        b.setForeground(Color.red);
        b.setFont(new Font("Arial",Font.BOLD,30));
        Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);
        c.add(b);
        b.addActionListener(this);
        l=new JLabel();
        c.add(l);
    }
    public void actionPerformed(ActionEvent ae)
    {
        ImageIcon ii=new ImageIcon("D:\\animated gif\\nirmit.gif");
        l.setIcon(ii);
    }
    public static void main(String args[])
    {
        hello h=new hello();
        h.setSize(300,400);
        h.setTitle("nirmit");
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
