/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.AdjustmentListener;
import java.awt.event.*;



public class myscroll extends Frame implements AdjustmentListener{
    String msg="";
    Scrollbar s1;
    myscroll()
    {
        this.setLayout(null);
        s1=new Scrollbar(Scrollbar.VERTICAL,0,30,0,400);
        s1.setBounds(250,50,30,200);
        this.add(s1);
        s1.addAdjustmentListener(this);
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent a)
            {
                System.exit(0);
            }
        });
    }
    public void adjustmentValueChanged(AdjustmentEvent a)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Scrollbar Position: ",20,150);
        msg+=s1.getValue();
        g.drawString(msg,20,180);
        msg="";
    }
    public static void main(String args[])
    {
        myscroll m=new myscroll();
        m.setTitle("my scroll");
        m.setSize(400,400);
        m.setVisible(true);
    }
}
