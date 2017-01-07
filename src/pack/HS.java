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
import java.util.HashSet;
import java.util.Iterator;
public class HS {
    public static void main(String args[])
    {
        HashSet<String> hs=new HashSet<String>();
        hs.add("nirmit");
        hs.add("maheshwari");
        hs.add("Anchal");
        hs.add("anchal");
        
        hs.add("nirmit");
        System.out.print("\n Hash set contain\t:"+hs);
        Iterator it=hs.iterator();
        System.out.print("\n Element using looping\t:");
       /* while(it.hasNext())
        {
            Object s=it.next();
            System.out.print(s+" ");
        }*/
        while(it.hasNext())
        {
            String s=(String)it.next();
            System.out.print(s);
        }
    }
}
