/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;


import java.util.Arrays;
import java.lang.*;

public class pair1 {
    public static void main(String args[])
    {
        Pair A[]=new Pair[5];
        A[0]=new Pair(5,10,20);
        A[1]=new Pair(4,12,34);
        A[2]=new Pair(3,12,56);
        A[3]=new Pair(2,10,23);
        A[4]=new Pair(1,5,67);
        Arrays.sort(A);
        for(int i=0;i<5;i++)
            System.out.println(A[i].first+" "+A[i].second+" "+A[i].third);
    }
}
class Pair implements Comparable<Pair>
{
    int first;
    int second;
    int third;
    Pair()
    {
        first=0;
        second=0;
        third=0;
    }
    Pair(int a,int b,int c)
    {
        first=a;
        second=b;
        third=c;
    }
    public int compareTo(Pair n)
    {
        if(first>n.first)
            return 1;
        else if(first<n.first)
            return -1;
        return 0;
    }
   /* public int compareTo(Pair p) {
			return p.first- first;
		}*/
}