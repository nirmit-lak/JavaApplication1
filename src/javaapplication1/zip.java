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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
public class zip {
    public static void main(String args[])throws FileNotFoundException,IOException
    {
        Scanner sc=new Scanner(System.in);
        FileInputStream fin=new FileInputStream("myfile.txt");
        FileOutputStream fout=new FileOutputStream("myfile1.txt");
        DeflaterOutputStream dout=new DeflaterOutputStream(fout);
        int data;
        while((data=fin.read())!=-1)
        {
            dout.write(data);
        }
    }
}
