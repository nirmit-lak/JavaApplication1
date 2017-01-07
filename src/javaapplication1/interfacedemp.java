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
interface MyInter
{
    void connect();
    void disconnect();
}
class OracleDB implements MyInter
{
    public void connect()
    {
        System.out.println("connect to oracel ");
        
    }
    public void disconnect()
    {
        System.out.println("disconnect to oracel ");
    }
}
class SybaseDB implements MyInter
{
    public void connect()
    {
        System.out.println("connect to Sybase ");
    }
    public void disconnect()
    {
        System.out.println("disconnect to Sybase ");
    }
}
public class interfacedemp {
    public static void main(String args[]) //throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        try
        {
        Class c=Class.forName(args[0]);
        MyInter me=(MyInter)c.newInstance();
        me.connect();
        me.disconnect();
        }
        catch(Exception e)
        {
            
        }
    }
}
