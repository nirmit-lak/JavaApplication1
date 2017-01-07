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



public class jpb extends JFrame implements ActionListener{
    JButton b;
    JProgressBar bar;
    jpb()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        b=new JButton("Click repeatly");
        bar=new JProgressBar();
        bar.setForeground(Color.gray);
        bar.setStringPainted(true);
        c.add(b);
        c.add(bar);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        bar.setValue(bar.getValue()+5);
    }
    public static void main(String args[])
    {
        jpb j=new jpb();
        j.setSize(400,400);
        j.setVisible(true);
        j.setTitle("Progess");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}