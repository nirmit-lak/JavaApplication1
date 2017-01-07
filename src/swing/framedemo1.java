
package swing;
import javax.swing.*;
import java.awt.*;




public class framedemo1 extends JFrame{
    public static void main(String args[]) 
    {
        framedemo1 f=new framedemo1();
        f.setTitle("my swing frame");
        f.setSize(200,200);
        Container c=f.getContentPane();
        c.setBackground(Color.black);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
