/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nirmit
 */
 class Frame2 extends Frame implements ActionListener
{
    Button b;
    Frame2()
    {
        setLayout(null);
         b=new Button("Back");
        b.setBounds(100,100,70,40);
        this.add(b);
        b.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        
        {
            this.dispose();
        }
    }
}
public class Frame1 extends Frame implements ActionListener{
    Button b1,b2;
    Frame1()
    {
        setLayout(null);
        b1=new Button("Next");
        b2=new Button("Close");
        b1.setBounds(100,100,70,40);
        b2.setBounds(200,100,70,40);
        this.add(b1);
        this.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            Frame2 f=new Frame2();
            f.setSize(400,400);
            f.setVisible(true);
        }
        else System.exit(0);
    }
    public static void main(String args[])
    {
        Frame1 f1=new Frame1();
        f1.setSize(400,400);
        f1.setTitle("nirmit");
        f1.setVisible(true);
    }
}
