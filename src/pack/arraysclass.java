package pack;
import java.util.Arrays;
//import static java.util.Arrays.copyOf;
public class arraysclass {
    public static void main(String args[])
    {
        int a[]={5,4,3,2,1};
        Arrays.sort(a);
        System.out.print(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
        int p=Arrays.binarySearch(a,1);
        System.out.print("\n position of 1 is "+p);
        //use of copy of function
        int b[];
        b=Arrays.copyOf(a,5);
        boolean a1=Arrays.equals(a,b);
        System.out.print("\n"+b[0]+" "+b[1]+" "+b[2]+" "+b[3]+" "+b[4]);
        System.out.print( "\n"+a1);
    }
}