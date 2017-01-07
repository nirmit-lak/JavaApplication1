/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.util.Arrays;
import static java.util.Arrays.fill;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nirmit
 */
public class Main1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=-9 % 1000;
        System.out.print(n);
    }
}
class reverse implements Comparator<Integer>
{
    public int compare(Integer k,Integer k1)
    {
        if(k>k1)
            return -1;
        else if(k<k1)
            return 1;
        return 0;
    }
}