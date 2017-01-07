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
import java.util.Stack;
public class stack {
    public static void main(String args[])
    {
        Stack<Integer> st=new Stack<Integer>();
        st.push(3);
        st.push(5);
        st.push(6);
        System.out.print("stack content\t:"+st);
        int t=st.peek();
        System.out.print("\n top element using peek \t:"+t);
        t=st.pop();
        System.out.print("\n Top element using pop \t:"+t);
        if(st.empty())
            System.out.print("\n Stack is empty");
        else 
            System.out.print("\n content are \t:"+st);
        t=st.search(5);
        if(t==-1)
            System.out.print("\n 5 does not exixt");
        else
            System.out.print("\n 5 exixt with position "+t);
    }
}
