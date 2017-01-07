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
import java.io.FileNotFoundException;
import java.io.IOException;
public class readfile {
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileInputStream fin = null;
        try
        {
            fin=new FileInputStream("myfile.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        int ch;
        while((ch=(int)fin.read())!=-1)
        {
            System.out.print((char)ch);
        }
        fin.close();
    }        
}