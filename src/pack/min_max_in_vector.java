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

    import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
public class min_max_in_vector
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Vector<Integer> v=new Vector<Integer>();
        for(int i=0;i<n;i++)
        {
            v.add(sc.nextInt());
        }
        int min=(Integer)Collections.min(v);
        int max=(Integer)Collections.max(v);
    }
    
}
    

