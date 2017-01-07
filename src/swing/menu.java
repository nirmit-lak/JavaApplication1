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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;


public class menu extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu file,edit,font;
    JMenuItem op,sa,cl,cp,pt,f1,f2;
    JCheckBoxMenuItem pr;
    menu()
    {
        Container c=this.getContentPane();
        c.setLayout(new BorderLayout());
        mb=new JMenuBar();
        c.add("North",mb);
        file=new JMenu("File");
        mb.add(file);
        edit=new JMenu("Edit");
        mb.add(edit);
        op=new JMenuItem("Open");
        file.add(op);
        sa=new JMenuItem("Save");
        file.add(sa);
        cl=new JMenuItem("Close");
        cl.setEnabled(false);
        edit.add(cl);
        cp=new JMenuItem("Copy");
        edit.add(cp);
        pt=new JMenuItem("Paste");
        edit.add(pt);
        pr=new JCheckBoxMenuItem("Printer");
        file.add(pr);
        file.addSeparator();
        font=new JMenu("Font");
        file.add(font);
        f1=new JMenuItem("Arial");
        font.add(f1);
        f2=new JMenuItem("Times New Roman");
        font.add(f2);
        op.addActionListener(this);
        sa.addActionListener(this);
        cl.addActionListener(this);
        cp.addActionListener(this);
        pt.addActionListener(this);
        pr.addActionListener(this);
        f1.addActionListener(this);
        f2.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(op.isArmed())System.out.println("Open is Selected");
        else if(sa.isArmed())System.out.println("Save is selected");
        else if(cl.isArmed())System.out.println("Close is selected");
        else if(cp.isArmed())System.out.println("copy is selected");
        else if(pt.isArmed())System.out.println("Paste is selected");
        else if(pr.getModel().isSelected())System.out.println("Printing on..");
        else System.out.println("Printing off..");
        if(f1.isArmed())System.out.println("Arial font is selected");
        if(f2.isArmed())System.out.println("Times new Roman is Selcted");
    }
    public static void main(String args[])
    {
        menu m=new menu();
        m.setSize(400,400);
        m.setTitle("nirmit");
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}