/*
     * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primealgos;

/**
 *
 * @author nirmit
 */
public class Sieve_of_Eratosthenes {
    public static void main(String args[])
    {
        int n=1000;
        int a[]=new int[n+1];
        for(int i=2;i*i<=1000;i++)
        {
            for(int j=i*i;j<=1000;j+=i)
            {
                a[j]=1;
            }
        }
        for(int i=2;i<=1000;i++)
        {
            if(a[i]==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
