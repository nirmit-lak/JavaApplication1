/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author nirmit
 */
public class Mybuttons extends Frame implements ActionListener{
    Button b1,b2,b3;
    Mybuttons()
    {
        this.setLayout(new FlowLayout());
        this.b1=new Button("Yellow");
        this.b2=new Button("Blue");
        this.b3=new Button("Pink");
        this.add(b1);
        this.add(b2);
        this.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1) this.setBackground(Color.YELLOW);
        else if(ae.getSource()==b2) this.setBackground(Color.BLUE);
        else this.setBackground(Color.PINK);
    }
    public static void main(String args[])
    {
        Mybuttons b=new Mybuttons();
        b.setSize(400,400);
        b.setTitle("nrimit");
        b.setVisible(true);
    }
}
