/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layoutmanager;

/**
 *
 * @author nirmit
 */
import java.awt.*;
import javax.swing.*;



public class grid extends JFrame{
    grid()
    {
        Container c=this.getContentPane();
        GridLayout grid1=new GridLayout(2,3,50,50);
        c.setLayout(grid1);
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("BUtton 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        
    }
    public static void main(String args[])
    {
        grid g=new grid();
        g.setSize(400,400);
        g.setVisible(true);
        g.setTitle("grid");
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
