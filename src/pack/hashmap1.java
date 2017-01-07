package pack;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;
public class hashmap1 {
    public static void main(String args[])
    {
        HashMap<Integer,Integer> mymap=new HashMap<Integer,Integer>();
        mymap.put(0,1);
        mymap.put(1,2);
        mymap.put(2,3);
        for(Entry<Integer,Integer> it : mymap.entrySet())
        {
            System.out.print(it.getKey()+" ");
            System.out.println(it.getValue());
        }
        // use of get(Object key) function
        System.out.println("value at key 2 is "+mymap.get(2));
        // use of keySet() function
        Set set=mymap.keySet();
        Iterator it=set.iterator();
        System.out.println("\n now values of keys in mymap are ");
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
        // use of Collection<V> values()  function 
        Collection<Integer> c=mymap.values();
        Iterator it1=c.iterator();
        System.out.println("\n values are ");
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
    }
}