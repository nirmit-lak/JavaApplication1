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
import javax.swing.border.*;
public class ButtonDemo extends JFrame{
    JButton b;
    ButtonDemo()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon ii=new ImageIcon("D:\\animated gif\\email.gif");
        b=new JButton("Click Me",ii);
        b.setBackground(Color.yellow);
        b.setForeground(Color.red);
        b.setFont(new Font("Arial",Font.BOLD,30));
        Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);
        b.setToolTipText("This is a button");
        b.setMnemonic('c');
        c.add(b);
        
    }
    public static void main(String args[])
    {
        ButtonDemo b=new ButtonDemo();
        b.setTitle("NIRMIT");
        b.setVisible(true);
        b.setSize(300,300);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}