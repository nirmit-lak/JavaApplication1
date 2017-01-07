



package swing;





import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class jlist extends JFrame implements ListSelectionListener{
    JList list;
    JLabel l;
    Object arr[];
    String str[];
    String s="";
    jlist()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        String item[]={"India","Pakistan","Bangladesh","Shrilanka","China"};
        list=new JList(item);
        list.setBounds(100,50,100,100);
        c.add(list);
        l=new JLabel();
        l.setBounds(50,200,400,40);
        c.add(l);
        list.addListSelectionListener(this);
    }
    public void valueChanged(ListSelectionEvent ie)
    {
        arr=list.getSelectedValues();     
        for(int i=0;i<arr.length;i++)
            s+=(String)arr[i];
        l.setText("selected : "+s);
        s="";            
    }
    public static void main(String args[])
    {
        jlist l=new jlist();
        l.setSize(400,400);
        l.setTitle("nirmit");
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}