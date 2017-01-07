/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.GraphicsEnvironment;

/**
 *
 * @author nirmit
 */
public class Fonts {
    public static void main(String args[])
    {
        GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
        String font[]=ge.getAvailableFontFamilyNames();
        System.out.print("\n available fonts are\t:");
        for(int i=0;i<font.length;i++)
            System.out.println(font[i]);
    }
}
