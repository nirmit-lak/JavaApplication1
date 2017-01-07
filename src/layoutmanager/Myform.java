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
public class Myform extends JApplet implements ActionListener
{
	String msg1="",msg2="",msg3="";
	Object x[];
	JLabel n,a,i,lbl;
	JTextField name;
	JTextArea addr;
	JButton b1,b2;
	JList lst;
	Container c;
	public void init()
	{
		JFrame jf=new JFrame();
		c=jf.getContentPane();
		c.setBackground(Color.YELLOW);
		c.setLayout(null);
		jf.setSize(800,500);
		jf.setTitle("My form");
		jf.setVisible(true);
		lbl=new JLabel("Z-ELECTRONICS ONLINE SHOP");
		Font f=new Font("Dialog",Font.BOLD,26);
		lbl.setFont(f);
		lbl.setForeground(Color.red);
		lbl.setBounds(200,10,500,50);
		c.add(lbl);
		n=new JLabel("Name :",JLabel.LEFT);
		n.setBounds(50,100,100,30);
		c.add(n);
		name =new JTextField(30);
		name.setBounds(200,100,200,30);
		c.add(name);
		a=new JLabel("Address : ",JLabel.LEFT);
		a.setBounds(50,150,100,30);
		c.add(a);
		addr=new JTextArea(5,50);
		addr.setBounds(200,150,200,100);
		c.add(addr);
		i=new JLabel("Select Item :",JLabel.LEFT);
		i.setBounds(50,270,200,100);
		c.add(i);
		String data[]={"TV","Washing Machine","DVD Player","Refigerator"};
		lst=new JList(data);
		lst.setBounds(200,270,200,100);
		c.add(lst);
		b1=new JButton("OK");
		b2=new JButton("Cancle");
		b1.setBounds(200,400,100,30);
		b2.setBounds(350,400,100,30);
		c.add(b1);
		c.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
	}
}