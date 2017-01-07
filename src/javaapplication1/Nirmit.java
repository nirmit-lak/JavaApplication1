/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package javaapplication1;

/**
 *
 * @author nirmit
 */
import java.util.Scanner;
public class Nirmit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int flag=1;
        for(int i=k-1;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
                flag=0;
        }
        if(flag==0)
            System.out.print(-1);
        else
            System.out.print((k-1));
    }
}
