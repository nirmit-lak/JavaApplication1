/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

/**
 *
 * @author nirmit
 */
public class Addition {
    private double d1,d2;
    public Addition(double a,double b)
    {
        d1=a;
        d2=b;
    }
    public void sum()
    {
        System.out.print("sum "+(d1+d2));
    }
}
