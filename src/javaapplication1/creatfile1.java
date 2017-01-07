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
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class creatfile1 {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        FileOutputStream fout=new FileOutputStream("myfile.txt",true);
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        for(int i=0;i<s.length();i++)
        {
            bout.write(s.charAt(i));
        }
        bout.close();
    }
    
}
