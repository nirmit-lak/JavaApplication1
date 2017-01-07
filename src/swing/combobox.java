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



public class combobox extends JFrame implements ItemListener{
    JComboBox box;
    JLabel l;
    combobox()
    {
        Container c=this.getContentPane();
        c.setLayout(null);
        box=new JComboBox();
        box.addItem("India");
        box.addItem("America");
        box.addItem("Germany");
        box.addItem("Japan");
        box.addItem("France");
        box.setBounds(100,50,100,50);
        c.add(box);
        l=new JLabel();
        l.setBounds(100,200,200,40);
        c.add(l);
        box.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        String str=(String)box.getSelectedItem();
        l.setText("You Selected ="+str);
        str="";
    }
    public static void main(String args[])
    {
        combobox b=new combobox();
        b.setSize(400,400);
        b.setTitle("nirmit");
        b.setVisible(true);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
