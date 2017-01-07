/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class mychoice extends Frame implements ItemListener{
    Choice ch;
    String msg;
    mychoice()
    {
        this.setLayout(new FlowLayout());
        ch=new Choice();
        ch.add("Hindi");
        ch.add("English");
        ch.add("Telgu");
        ch.add("Sanskrit");
        ch.add("Telgu");
        this.add(ch);
        ch.addItemListener(this);
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Selected Language :",10,100);
        msg=ch.getSelectedItem();
        g.drawString(msg,10,120);
    }
    public static void main(String args[])
    {
        mychoice mc=new mychoice();
        mc.setTitle("nirmit");
        mc.setSize(400,400);
        mc.setVisible(true);
    }
}