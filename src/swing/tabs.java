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



public class tabs extends JFrame{
    tabs()
    {
        Container c=getContentPane();
        JTabbedPane t1=new JTabbedPane();
        t1.addTab("Capitals",new capitals());
        t1.addTab("countries",new countries());
        c.add(t1);
    }
    public static void main(String args[])
    {
        tabs t=new tabs();
        t.setSize(400,400);
        t.setTitle("panel with tabs");
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class capitals extends JPanel
{
    capitals()
    {
        JButton b1=new JButton("Washington");
        JButton b2=new JButton("London");
        JButton b3=new JButton("Tokyo");
        this.add(b1);
        this.add(b2);
        this.add(b3);
    }   
}
class countries extends JPanel
{
    countries()
    {
        JCheckBox c1=new JCheckBox("America");
        JCheckBox c2=new JCheckBox("England");
        JCheckBox c3=new JCheckBox("Japan");
        add(c1);
        add(c2);
        add(c3);
    }
}