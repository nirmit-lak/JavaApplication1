/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nirmit
 */
public class sort_array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Short a[]=new Short[5];
        for(int i=0;i<5;i++)
            a[i]=sc.nextShort();
        Comparator<Short> comp = Collections.reverseOrder();
        Arrays.sort(a, comp);
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
