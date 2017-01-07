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
import java.util.LinkedList;
public class linkedlist {
    public static void main(String args[])
    {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("nirmit");
        ll.add("anchal");
        ll.add(2,"maheshwari");
        ll.addFirst("vinay");
        ll.addLast("maneesha");
        System.out.println("element of list"+ll);
        ll.removeFirst();
        System.out.println("element of list"+ll);
        ll.removeLast();
        System.out.println("element of list"+ll);
        ll.remove(0);
        System.out.println("element of list"+ll);
        System.out.println("element at 0"+ll.get(0));
        ll.set(0,"lakhotia");
        System.out.println("after replace list is"+ll);
        System.out.println("Index of lakhotia "+ll.indexOf("lakhotia"));
    }
}