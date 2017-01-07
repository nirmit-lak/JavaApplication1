/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;


public class treedemo extends JFrame implements TreeSelectionListener{
    DefaultMutableTreeNode root,dir1,dir2,file1,file2,file3;
    JTree tree;
    Container c;
    String msg="";
    JTextArea ta;
    treedemo()
    {
        c=this.getContentPane();
        c.setLayout(new BorderLayout());
        root=new DefaultMutableTreeNode("C:\\");
        dir1=new DefaultMutableTreeNode("Javaprogrammer");
        dir2=new DefaultMutableTreeNode("Other Program");
        file1=new DefaultMutableTreeNode("Jbuttondemo.java");
        file2=new DefaultMutableTreeNode("JcheckBoxdemo.java");
        file3=new DefaultMutableTreeNode("xyz.c");
        root.add(dir1);
        root.add(dir2);
        dir1.add(file1);
        dir2.add(file3);
        dir1.add(file2);
        tree=new JTree(root);
        c.add("North",tree);
        ta=new JTextArea();
        c.add("South",ta);
        tree.addTreeSelectionListener(this);
        
    }
    public void valueChanged(TreeSelectionEvent te)
    {
        TreePath tp=te.getNewLeadSelectionPath();
        msg+="\n Path of selected component ="+tp;
        Object comp=tp.getLastPathComponent();
        msg+="\n Component selected ="+comp;
        int n=tp.getPathCount();
        msg+="\nLevel of component ="+n;
        ta.setText(msg);
        msg="";
    }
    public static void main(String args[])
    {
        treedemo t=new treedemo();
        t.setSize(400,400);
        t.setTitle("nirmit");
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
