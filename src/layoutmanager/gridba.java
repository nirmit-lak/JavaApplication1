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



public class gridba extends JFrame{
    GridBagLayout gbag;
    GridBagConstraints cons;
    gridba()
    {
        Container c=this.getContentPane();
        gbag=new GridBagLayout();
        c.setLayout(gbag);
        cons=new GridBagConstraints();
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        cons.fill=GridBagConstraints.HORIZONTAL;
        cons.gridx=0;
        cons.gridy=0;
        cons.weightx=0.7;
        gbag.setConstraints(b1,cons);
        c.add(b1);
        cons.gridx=1;
        cons.gridy=0;
        gbag.setConstraints(b2, cons);
        c.add(b2);
        cons.gridx=2;
        cons.gridy=0;
        gbag.setConstraints(b3,cons);
        c.add(b3);
        cons.gridx=0;
        cons.gridy=1;
        cons.ipady=100;
        cons.gridwidth=3;
        gbag.setConstraints(b4,cons);
        c.add(b4);
        cons.gridx=1;
        cons.gridy=2;
        cons.ipady=0;
        cons.weighty=0.8;
        cons.anchor=GridBagConstraints.PAGE_END;
        cons.insets=new Insets(0,0,50,0);
        cons.gridwidth=2;
        gbag.setConstraints(b5, cons);
        c.add(b5);
    }
    public static void main(String args[])
    {
        gridba g=new gridba();
        g.setSize(400,400);
        g.setVisible(true);
        g.setTitle("Nirmit");
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
