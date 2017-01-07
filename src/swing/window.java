/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing;

import javax.swing.JFrame;
import javax.swing.JWindow;
/*from   w w w.ja va 2s  .c o m*/
public class window {
  public static void main(String[] args) {
    JFrame f = new JFrame("The Frame");
    f.setSize(300, 300);
    f.setLocation(100, 100);

    JWindow w = new JWindow();
    w.setSize(300, 300);
    w.setLocation(500, 100);

    w.setVisible(true);
    f.setVisible(true);
  }
}