/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class mytext extends Frame implements ActionListener{
    TextField name,pass;
    mytext()
    {
        setLayout(new FlowLayout());
        Label n=new Label("Name: ",Label.LEFT);
        name=new TextField(20);
        Label p=new Label("Password: ",Label.LEFT);
        pass=new TextField(20);
        pass.setEchoChar('*');
        name.setBackground(Color.YELLOW);
        name.setForeground(Color.RED);
        Font f=new Font("Arial",Font.PLAIN,25);
        this.add(n);
        this.add(name);
        this.add(p);
        this.add(pass);
        name.addActionListener(this);
        pass.addActionListener(this);
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
        Graphics g=this.getGraphics();
        g.drawString("Name: "+name.getText(),10,200);
        g.drawString("Password:"+pass.getText(),10,240);
    }
    public static void main(String args[])
    {
        mytext mt=new mytext();
        mt.setSize(400,400);
        mt.setTitle("i am student");
        mt.setVisible(true);
    }
}
