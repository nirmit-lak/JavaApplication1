/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.awt.Point;
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
import java.util.StringTokenizer;
 
 
public class arjun_sir{
    
    ///////////////////////////////////////////////////////////////////////////
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
    
    ////////////////////////////////////////////////////////////////////
    //      Number Theory
    
    long pow(long a,long b,long mod){
        long x = 1; long y = a;
        while(b > 0){
            if(b % 2 == 1){
                x = (x*y);
                x %= mod;
            }
            y = (y*y);
            y %= mod;
            b /= 2;         
        }
        return x;
    }
    
    int divisor(long x,long[] a){
        long limit = x;
        int numberOfDivisors = 0;
 
        for (int i=1; i < limit; ++i) {
            if (x % i == 0) {
                limit = x / i;
                if (limit != i) {
                    numberOfDivisors++;
                }
                numberOfDivisors++;
            }
        }
        return numberOfDivisors;
    }
    
    void findSubsets(int array[]){
        long numOfSubsets = 1 << array.length; 
        for(int i = 0; i < numOfSubsets; i++){    
            @SuppressWarnings("unused")
            int pos = array.length - 1;
            int bitmask = i;
            while(bitmask > 0){     
                if((bitmask & 1) == 1)
//                    ww.print(array[pos]+" ");
                bitmask >>= 1;
                pos--;
            }
//            ww.println();
        }
    }
    
    
    public static long gcd(long a, long b){
        return b == 0 ? a : gcd(b,a%b);
    }
    
  
    public static int lcm(int a,int b, int c){
        return lcm(lcm(a,b),c);
    }
    
    public static int lcm(int a, int b){
        return (int) (a*b/gcd(a,b));
    }
    
    public static long invl(long a, long mod) {
        long b = mod;
        long p = 1, q = 0;
        while (b > 0) {
            long c = a / b;
            long d;
            d = a;
            a = b;
            b = d % b;
            d = p;
            p = q;
            q = d - c * q;
        }
        return p < 0 ? p + mod : p;
    }
    
    ////////////////////////////////////////////////////////////////////
    
    
//    FastScanner s = new FastScanner(new File("input.txt"));
//    PrintWriter ww = new PrintWriter(new FileWriter("output.txt"));
    static InputStream inputStream = System.in;
    static FastScanner s = new FastScanner(inputStream); 
    static OutputStream outputStream = System.out;
    static PrintWriter ww = new PrintWriter(new OutputStreamWriter(outputStream));
//      private static Scanner s = new Scanner(System.in);
    @SuppressWarnings("unused")
    private static int[][] states = { {-1,0} , {1,0} , {0,-1} , {0,1} };
    
      
    //////////////////////////////////////////////////////////////////// 
     
    
     
    public static void main(String[] args) throws IOException{
        new arjun_sir().solve();
        s.close();
        ww.close();
    }
    
    
    ////////////////////////////////////////////////////////////////////
   
    
    void solve() throws IOException{
        
        int n = s.nextInt();
        int m = s.nextInt();
        
        int a = Math.min(n, m);
        int aa = a;
        int b = 0;
        ww.println(a+1);
        
        while(a >= 0 && b <= aa){
            ww.println(a+" "+b);
            a--; b++;
        }        
    }
}