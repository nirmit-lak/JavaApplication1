/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author nirmit
 */
public class Mybutton extends Frame implements ActionListener{
    Button b1,b2,b3;
            Mybutton()
            {
                this.setLayout(null);
                b1=new Button("Yellow");
                b2=new Button("Blue");
                b3=new Button("Pink");
                b1.setBounds(100,100,70,40);
                b2.setBounds(100,160,70,40);
                b3.setBounds(100,220,70,40);
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
                String str=ae.getActionCommand();
                if(str.equals("Yellow"))this.setBackground(Color.YELLOW);
                else if(str.equals("Blue"))this.setBackground(Color.BLUE);
                else this.setBackground(Color.PINK);
            }
            public static void main(String args[])
            {
                Mybutton b=new Mybutton();
                b.setSize(400,400);
                b.setTitle("My button");
                b.setVisible(true);
            }
}
