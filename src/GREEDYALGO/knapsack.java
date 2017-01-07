/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GREEDYALGO;


import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class knapsack {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> p=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> w=new HashMap<Integer,Integer>();
        System.out.print("Enter the no. of objects\t:");
        int n=sc.nextInt();
        Pair r[]=new Pair[n];
        int p1,w1;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the price\t:");
            p1=sc.nextInt();
            p.put(i, p1);
            System.out.print("Enter the weight\t:");
            w1=sc.nextInt();
            w.put(i, w1);
            double a=((double)p1)/((double)w1);
            r[i]=new Pair(a,i);
        }
        Arrays.sort(r);
        System.out.print("Enter the minmum object to fill bag\t:");
        int m=sc.nextInt();
        //int min=Math.min(m, w.get(r[0].second));
        //int max=Math.max(m, w.get(r[0].second));
        //int max1,min1;
        double price=0;
        int i=0;
        while(m>0)
        {
            if(m>w.get(r[i].second))
            {
                price+=(double)p.get(r[i].second);
                m-=w.get(r[i].second);
            }
            else
            {
                price+=(double)(r[i].first * m);
                m=0;
            }
            i++;
        }
        System.out.print(price);
    }
}
class Pair implements Comparable<Pair>
{
    double first;
    int second;
    Pair()
    {
        first=0;
        second=0;
    }
    Pair(double first,int second)
    {
        this.first=first;
        this.second=second;
    }
    public int compareTo(Pair n)
    {
        if(first>n.first)
            return -1;
        else if(first<n.first)
            return 1;
        return 0;
    }
}