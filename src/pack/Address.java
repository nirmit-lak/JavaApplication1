package pack;
import java.net.InetAddress;
import java.util.Scanner;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Address {
    public static void main(String args[]) throws UnknownHostException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a website name\t:");
        String site=sc.nextLine();
        try
        {
            InetAddress ip=InetAddress.getByName(site);
            System.out.println("The IP address is\t:"+ip);
        }
        catch(UnknownHostException e)
        {
            System.out.println("website not found");
        }
    }
}
