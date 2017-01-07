



package swing;



import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;


public class jtabledemo extends JFrame
{
    jtabledemo()
    {
        Vector<Vector> data=new Vector<Vector>();
        Vector<String> row=new Vector<String>();
        row.add("RAM SAGAR");
        row.add("ENGINEER");
        row.add("10000");
        data.add(row);
        row=new Vector<String>();
        row.add("KUMAR GURU");
        row.add("PROGRAMMER");
        row.add("40000");
        data.add(row);
        row=new Vector<String>();
        row.add("BILLU");
        row.add("PROGRAMMER");
        row.add("50000");
        data.add(row);
        Vector<String> cols=new Vector<String>();
        cols.add("NAME");
        cols.add("OCUPATION");
        cols.add("SALARY");
        JTable tb=new JTable(data,cols);
        tb.setBorder(BorderFactory.createLineBorder(Color.green,1));
        tb.setFont(new Font("Arial",Font.BOLD,20));
        tb.setRowHeight(30);
        tb.setGridColor(Color.red);
        JTableHeader head=tb.getTableHeader();
        Container c=this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add("North",head);
        c.add("Center",tb);
    }
    public static void main(String args[])
    {
        jtabledemo d=new jtabledemo();
        d.setSize(400,400);
        d.setTitle("my table");
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}