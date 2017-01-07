package pack;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Pair1[] p=new Pair1[5];
        p[0]=new Pair1(1,7);
        p[1]=new Pair1(2,3);
        p[2]=new Pair1(3,7);
        p[3]=new Pair1(4,2);
        p[4]=new Pair1(5,1);
        Arrays.sort(p);
        for(int i=0;i<5;i++)
            System.out.println(p[i].first+" "+p[i].second);
    }   
}
 class Pair1 implements Comparable<Pair1>
{
     Integer first;
     Integer second;
     Pair1()
     {
         first=0;
         second=0;
     }
     Pair1(Integer f,Integer s)
     {
         first=f;
         second=s;
     }
    public int compareTo(Pair1 m)
    {
        if(second>m.second)
            return 1;
        else if(second<m.second)
            return -1;
        return 0;
    }
}