/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;



public class exp1 {
    static class FastScanner{
        BufferedReader s;
        StringTokenizer st;
        
        public FastScanner(InputStream InputStream){
            st = new StringTokenizer("");
            s = new BufferedReader(new InputStreamReader(InputStream));
        }
        
        public FastScanner(File f) throws FileNotFoundException{
            st = new StringTokenizer("");
            s = new BufferedReader (new FileReader(f));
        }
        
        public int nextInt() throws IOException{
            if(st.hasMoreTokens())
                return Integer.parseInt(st.nextToken());
            else{
                st = new StringTokenizer(s.readLine());
                return nextInt();
            }
        }
        
        public BigInteger big() throws IOException{
            if(st.hasMoreTokens())
                return new BigInteger(st.nextToken());
            else{
                st = new StringTokenizer(s.readLine());
                return big();
            }
        }
        
        public double nextDouble() throws IOException{
            if(st.hasMoreTokens())
                return Double.parseDouble(st.nextToken());
            else{
                st = new StringTokenizer(s.readLine());
                return nextDouble();
            }
        }
      
        public long nextLong() throws IOException{
            if(st.hasMoreTokens())
                return Long.parseLong(st.nextToken());
            else{
                st = new StringTokenizer(s.readLine());
                return nextLong();
            }
        }
        
        public String nextString() throws IOException{
            if(st.hasMoreTokens())
                return st.nextToken();
            else{
                st = new StringTokenizer(s.readLine());
                return nextString();
            }
            
        }
        public String readLine() throws IOException{
            return s.readLine();
        }
        
        public void close() throws IOException{
            s.close();
        }
        
    }
    
    
    static InputStream input=System.in;
    static FastScanner sc=new FastScanner(input);
    static OutputStream out=System.out;
    static PrintWriter ww=new PrintWriter(new OutputStreamWriter(out));
    static public void main(String args[]) throws IOException
    {
        int n=sc.nextInt();
        pair1 p[]=new pair1[n];
        for(int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            p[i]=new pair1(i+1,t);
        }
        Arrays.sort(p,new sec1());
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
      
       map.clear();
        
    }
}
class pair1
{
    Integer first;
    Integer second;
    pair1()
    {
        first=0;
        second=0;
    }
    pair1(Integer f,Integer s)
    {
        first=f;
        second=s;
    }
}
class first1 implements Comparator<pair1>
{
    public int compare(pair1 m,pair1 n)
    {
        if(m.first>n.first)
            return 1;
        else if(m.first<n.first)
            return -1;
        return 0; 
    }
}
class sec1 implements Comparator<pair1>
{
    public int compare(pair1 m,pair1 n)
    {
        if(m.second>n.second)
            return 1;
        else if(m.second<n.second)
            return -1;
        return 0;
    }
}
