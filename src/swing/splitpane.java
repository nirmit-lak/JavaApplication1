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
import java.awt.event.*;
import javax.swing.*;

public class splitpane extends JFrame implements ActionListener{
    String str="This is my text being displayed in the text area"+" and this will be wrapped accordingly";
    JButton b;
    JTextArea ta;
    JSplitPane sp;
    splitpane()
    {
        Container c=this.getContentPane();
        c.setLayout(new BorderLayout());
        b=new JButton("MY BUTTON");
        ta=new JTextArea();
        ta.setLineWrap(true);
        sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,b,ta);
        c.add("Center",sp);
        b.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        ta.setText(str);
    }
    public static void main(String args[])
    {
        splitpane p=new splitpane();
        p.setSize(400,400);
        p.setTitle("split pane");
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
