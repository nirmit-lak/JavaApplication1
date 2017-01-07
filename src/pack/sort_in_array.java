package pack;
import java.util.Arrays;
import java.util.Comparator;
class Ascending implements Comparator<Integer>
{
    public int compare(Integer a,Integer b)
    {
        if(a<b)
            return -1;
        else if(a>b)
            return 1;
        else
            return 0;
    }
}
class decend implements Comparator<Integer>
{
    public int compare(Integer a,Integer b)
    {
        if(a>b)
            return -1;
        else if(a<b)
            return 1;
        else
            return 0;
    }
}
class str implements Comparator<String>
{
    public int compare(String a,String b)
    {
        if(a.length()>b.length())
            return 1;
        else if(a.length()<b.length())
            return -1;
        else
            return 0;
    }
}
public class sort_in_array {
   public static void main(String args[])
   {
       Integer a[]={6,5,4,3,2,1};
       Arrays.sort(a,new decend());
       for(int i=0;i<6;i++)
       {
           System.out.print(a[i]+" ");
       }
       String s[]={"nirmit","maheshwari","lakhotia","kumar"};
       System.out.println();
       Arrays.sort(s,new str());
       for(int i=0;i<4;i++)
       {
           System.out.print(s[i]+" ");
       }
   }
}