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
import java.awt.event.*;




public class cardlayout extends JFrame implements ActionListener{
    Container c;
    JButton b1,b2,b3,b4;
    CardLayout card;
    cardlayout()
    {
        c=this.getContentPane();
        card=new CardLayout(0,10);
        c.setLayout(card);
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        c.add("First card",b1);
        c.add("Second card",b2);
        c.add("Third card",b3);
        c.add("Fourth card",b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        card.next(c);
    }
    public static void main(String args[])
    {
        cardlayout l=new cardlayout();
        l.setSize(400,400);
        l.setTitle("Nirmit");
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}