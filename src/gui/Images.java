/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author nirmit
 */
public class Images extends Frame{
    static Image img;
    Images()
    {
        img=Toolkit.getDefaultToolkit().getImage("C:\\Users\\nirmit\\Desktop\\a.jpg");
        MediaTracker track=new MediaTracker(this);
        track.addImage(img,0);
        try
        {
            track.waitForID(0);
            
        }catch(InterruptedException e)
        {
            System.out.print("\n OMG !");
        }
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,50,50,null);
    }
    public static void main(String args[])
    {
        Images i=new Images();
        i.setSize(700,600);
        i.setIconImage(img);
        i.setTitle("Oh ! GOD PLEASE HELP ME");
        i.setVisible(true);
    }
}
