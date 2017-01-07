/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author nirmit
 */
import java.awt.event.WindowAdapter;
import java.awt.Frame;
import java.awt.event.WindowEvent;
public class myframe3 {
    public static void main(String args[])
    {
        Frame f=new Frame();
        f.setTitle("nirmit");
        
        f.setSize(700,700);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent s)
            {
                System.exit(0);
            }
        });
    }
}
