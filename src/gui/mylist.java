/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.*;
import java.awt.event.*;




public class mylist extends Frame implements ItemListener{
    int msg[];
    List lst;
    mylist()
    {
        this.setLayout(new FlowLayout());
        lst=new List(4,true) {};
        lst.add("English");
        lst.add("Hindi");
        lst.add("Sanskrit");
        lst.add("Telgu");
        lst.add("French");
        this.add(lst);
        lst.addItemListener(this);
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ae)
            {
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent a)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Selected Language: ",100,200);
        msg=lst.getSelectedIndexes();
        for(int i=0;i<msg.length;i++)
        {
            String s=lst.getItem(msg[i]);
            g.drawString(s,100,220+i*20);
        }
    }
    public static void main(String args[])
    {
        mylist ml=new mylist();
        ml.setTitle("my box");
        ml.setSize(400,400);
        ml.setVisible(true);
    }
}
