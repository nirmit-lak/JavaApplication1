/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


/**
 *
 * @author nirmit
 */
public class hashmap_sort {
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
      //  int k=sc.nextInt();
        Hashtable<Character,Integer> m=new Hashtable<Character,Integer>();
        //String s=sc.next();
        m.put('n', 90);
        m.put('k', 80);
        m.put('l', 70);
        m.put('o', 60);
        m.put('u', 50);
        m.put('i', 40);
        byvalue v=new byvalue(m);
        TreeMap<Character,Integer> m1=new TreeMap<Character,Integer>(v);
        m1.putAll(m);
        System.out.print(m1);
    }
}

class byvalue implements Comparator<Character>
{
    Hashtable<Character,Integer> n;
    byvalue(Hashtable<Character,Integer> k)
    {
        n=k;
    }
    public int compare(Character o,Character o1)
    {
        if(n.get(o)>n.get(o1))
            return 1;
        else if(n.get(o)<n.get(o1))
            return -1;
        return 0;
    }
}