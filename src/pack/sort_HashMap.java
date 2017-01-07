/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author nirmit
 */
public class sort_HashMap {
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Character> m=new HashMap<Integer,Character>();
        m.put(20, 'a');
        m.put(9, 'n');
        m.put(4, 'n');
        Map<Integer,Character> m1=new TreeMap<Integer,Character>(m);
        Set st=m1.entrySet();
        Iterator it=st.iterator();
        while(it.hasNext())
        {
            Map.Entry m3=(Map.Entry)it.next();
            System.out.println(m3.getKey()+" "+m3.getValue());
        }
    }
}
