/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 *
 * @author nirmit
 */
public class Tree_sort_byvalue {
    public static void main(String args[])
    {
        final TreeMap<Integer,Integer> sq=new TreeMap<Integer,Integer>();
        sq.put(1,5);
        sq.put(2,4);
        sq.put(3,3);
        sq.put(4,2);
        sq.put(5,1);
        final TreeMap<Integer,Integer> sortbyvalue=new TreeMap<Integer,Integer>(new Comparator<Integer>()
        {
            public int compare(Integer o1,Integer o2){
                    return sq.get(o1).compareTo(sq.get(o2));}
        });
        System.out.println(sq);
        sortbyvalue.putAll(sq);
        System.out.println(sortbyvalue);
        sortbyvalue.clear();
        System.out.println(sortbyvalue);
        System.out.println(sq);
    }
}
