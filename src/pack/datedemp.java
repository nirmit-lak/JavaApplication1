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
import java.util.Calendar;
public class datedemp {
    public static void main(String args[])
    {
        Calendar c1=Calendar.getInstance();
        System.out.print("Date :");
        int dd=c1.get(Calendar.DATE);
        int mm=c1.get(Calendar.MONTH);
        int yy=c1.get(Calendar.YEAR);
        System.out.println(dd+"-"+mm+"-"+yy);
        System.out.print("Time :");
        int h=c1.get(Calendar.HOUR);
        int m=c1.get(Calendar.MINUTE);
        int s=c1.get(Calendar.SECOND);
        System.out.println(h+"-"+m+"-"+s);
    }   
}
