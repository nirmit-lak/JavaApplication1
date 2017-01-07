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
interface father
{
    double h=5.67;
    void height();
}
interface mother
{
    double h=6.23;
    void height();
}
class child implements father,mother
{
    public void height()
    {
        double h=father.h+mother.h;
        System.out.print(h);
    }
}
public class Multi {
        public static void main(String args[])
        {
            child d=new child();
            d.height();
        }
}
