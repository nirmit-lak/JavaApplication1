/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layoutmanager;
import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JFrame;


class Home 
{
	Container c;
	Home()
	{
		JFrame  jf=new JFrame();
		c=jf.getContentPane();
		c.setLayout(null);
		jf.setSize(500,500);
		jf.setTitle("nirmit");
		jf.setVisible(true);
	}
}


public class crime extends JApplet {
	public void init()
	{
		Home h=new Home();
	}
}