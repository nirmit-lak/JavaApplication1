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
import java.util.LinkedHashSet;
public class LHS {
    public static void main(String args[])
    {
        LinkedHashSet<String> hs=new LinkedHashSet<String>();
        hs.add("nirmit");
        hs.add("maheshwari");
        hs.add("anchal");
        hs.add("Anchal");
        hs.add("nirmit");
        System.out.print(hs);
    }
}