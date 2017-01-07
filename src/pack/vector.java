/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

/**
 *
 * @author nirmit
 */
import java.util.Vector;
public class vector {
    public static void main(String args[])
    {
        Vector<Integer> v=new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        System.out.println("element of vectot are\t:"+v);
        v.add(5,6);
        System.out.println("element of vectot are\t:"+v);
        boolean t;
        t=v.remove((Integer)(6));
        System.out.println(t);
        System.out.println("element of vectot are\t:"+v);
        t=v.contains((Integer)6);
        System.out.println(t);
        System.out.println(v.indexOf((Integer)3)+" "+v.lastIndexOf((Integer)3));
        System.out.println(v.size());
        System.out.println(v.get(4));
    }             
}