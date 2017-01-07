package javaapplication1;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main {
  public static void main(String[] argv) throws Exception {
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    JFrame window = new JFrame();
    window.setSize(300,300);
    
    int w = window.getSize().width;
    int h = window.getSize().height;
    int x = (dim.width - w) / 2;
    int y = (dim.height - h) / 2;

    window.setLocation(x, y);

    window.setVisible(true);
  }
}