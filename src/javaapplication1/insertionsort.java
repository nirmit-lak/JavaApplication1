/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author nirmit
 */
import java.util.Scanner;
public class insertionsort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers of numbers to sort\t:");
        int n=Integer.parseInt(sc.next());
        System.out.print("\n Enter the numbers \t:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(sc.next());
        }
      /*  System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
        }*/
        for(int j=1;j<n;j++)
        {
            int i=j;
            while(i!=0 && a[i-1]>a[i]  )
            {
                int t;
                t=a[i];
                a[i]=a[i-1];
                a[i-1]=t;
                i--;
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
        }
    }
}