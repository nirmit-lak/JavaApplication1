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
import java.awt.event.*;





public class layoutsdemo extends JFrame implements ActionListener{
    Container c;
    CardLayout card;
    JButton b1;
    layoutsdemo()
    {
        c=this.getContentPane();
        card=new CardLayout();
        c.setLayout(card);
        b1=new JButton("Button 1");
        c.add("First card",b1);
        c.add("Second card",new MYPanel());
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        card.next(c);
    }
    public static void main(String args[])
    {
        layoutsdemo demo=new layoutsdemo();
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setTitle("Nirmit");
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MYPanel extends JPanel
{
    JTextField tf;
    JCheckBox cb;
    JButton b;
    MYPanel()
    {
        this.setLayout(new BorderLayout());
        tf=new JTextField("Text Field",15);
        b=new JButton("OK");
        cb=new JCheckBox("Check box");
        this.add("North",tf);
        this.add("South",b);
        this.add("East",cb);
    }
}