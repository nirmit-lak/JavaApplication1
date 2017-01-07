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
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class creatfile {
    public static void main(String args[])throws FileNotFoundException,IOException
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        FileOutputStream fout=new FileOutputStream("myfile.txt");
        for(int i=0;i<s.length();i++)
        {
            fout.write((char)s.charAt(i));
        }
        fout.close();
    }
}
