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



public class flowlayout extends JFrame{
    flowlayout()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        JButton b1,b2,b3,b4;
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
    }
    public static void main(String args[])
    {
        flowlayout f=new flowlayout();
        f.setSize(400,400);
        f.setTitle("Nirmit");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
