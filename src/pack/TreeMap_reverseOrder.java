/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author Maheshwari
 */
public class TreeMap_reverseOrder {
    public static void main(String args[])
    {
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>(Collections.reverseOrder());
        map.put(5,3);
        map.put(9,2);
        map.put(93,39);
        map.put(34,654);
        for(Entry<Integer,Integer> e:map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
