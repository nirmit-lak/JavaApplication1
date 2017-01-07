/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pair p[]=new pair[n];
        for(int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            p[i]=new pair(i+1,t);
        }
        Arrays.sort(p,new sec());
       // Set<Integer> set=new HashSet<Integer>();
        Integer t1=0;
        for(int i=0;i<n;i++)
        {
            Integer t=p[i].second;
            if(i!=0 && p[i].second <=p[i-1].second)
                p[i].second=p[i-1].second+1;
            /*boolean k=set.add(t);
            
            if(!k)
            {
                p[i].second= ++t1;
                t=t1;
                set.add(t);
            }
             t1=t;*/
            
        }
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
        {
            map.put(p[i].first,p[i].second);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(map.get((i+1))+" ");
        }
        sc.close();
       map.clear();
        
    }
}
class pair 
{
    Integer first;
    Integer second;
    pair()
    {
        first=0;
        second=0;
    }
    pair(Integer f,Integer s)
    {
        first=f;
        second=s;
    }
}
class first implements Comparator<pair>
{
    public int compare(pair m,pair n)
    {
        if(m.first>n.first)
            return 1;
        else if(m.first<n.first)
            return -1;
        return 0; 
    }
}
class sec implements Comparator<pair>
{
    public int compare(pair m,pair n)
    {
        if(m.second>n.second)
            return 1;
        else if(m.second<n.second)
            return -1;
        return 0;
    }
}