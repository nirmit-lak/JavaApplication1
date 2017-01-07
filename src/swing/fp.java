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
class panel extends JPanel
{
    panel()
    {
        this.setBackground(Color.green);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("Helvetica",Font.BOLD,34));
        g.drawString("Hello Learners",70,100);
    }
}
public class fp extends JFrame{
    fp()
    {
        Container c=this.getContentPane();
        panel p=new panel();
        c.add(p);
    }
    public static void main(String arg[])
    {
        fp f=new fp();
        f.setTitle("my swing frame");
        f.setSize(400,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
