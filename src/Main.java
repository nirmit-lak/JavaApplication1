import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;


// techgig (mindtree hiring optimisation question solution 80 marks)

public class Main
{
    static StringTokenizer st=new StringTokenizer("");
    static BufferedReader br;
    ///////////////////////////////////////////////////////////////////////////////////
    
    static int pr;
    static int pc;
    static int pheightsArray[];

    static boolean fun(int r1, int column, int atHeight, int directionIndex) 
    {
        if (r1 == 0 || r1 == pr - 1 || column == 0 || column == pc - 1)
            return false; 
        if (directionIndex == 1) 
        { 
            if (pheightsArray[(r1 - 1) * pc + column] > atHeight)
                return true;
            else
                return (fun(r1 - 1, column, atHeight, 1) && fun(r1 - 1, column, atHeight, 3) && fun( r1 - 1, column, atHeight, 4));
        } 
        else if (directionIndex == 2) 
        { 
            if (pheightsArray[(r1 + 1) * pc + column] > atHeight)
                return true;
            else
                return (fun(r1 + 1, column, atHeight, 2) && fun(r1 + 1, column, atHeight, 3) && fun( r1 + 1, column, atHeight, 4));
        } 
        else if (directionIndex == 3) 
        { 
            if (pheightsArray[r1 * pc + column - 1] > atHeight)
                return true;
            else
                return (fun(r1, column - 1, atHeight, 1) && fun(r1, column - 1, atHeight, 2) && fun( r1, column - 1, atHeight, 3));
        } 
        else if (directionIndex == 4) 
        { 
            if (pheightsArray[r1 * pc + column + 1] > atHeight)
                return true;
            else
                return (fun(r1, column + 1, atHeight, 1)   && fun(r1, column + 1, atHeight, 2) && fun(r1, column + 1, atHeight, 4));
    }
    return false;
}

public static int GetWaterLevel(int input1, int input2, int input3[]) {
    int r = input1;
    int c = input2;
    int heightsArray[] = input3;
    pr = r;
    pc = c;
    pheightsArray = heightsArray;
    int total = 0;
    int row = 0;
    int column = 0;
    int maxHeight = 0;
    int atHeight = 0;
    for (row = 0; row < r * c; row++)
        if (input3[row] > maxHeight)
            maxHeight = input3[row];
    for (row = 0; row < r; row++) {
        for (column = 0; column < c; column++) {
            if (row == 0 || row == r - 1 || column == 0
                    || column == c - 1)
                continue;
            for (atHeight = heightsArray[row * c + column]; atHeight < maxHeight; atHeight++) {
                if (fun(row, column, atHeight, 1) && 
                        fun(row, column, atHeight, 2) && 
                        fun(row, column, atHeight, 3) && 
                        fun(row, column, atHeight, 4)) { 
                    total++;
                } else
                    atHeight = maxHeight;
            }
        }
    }
    return total;
}
    
    public static void main(String args[]) throws FileNotFoundException, IOException, Exception
    {
        //Scanner in =new Scanner(new FileReader("input.txt"));
        //PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        //Scanner in=new Scanner(System.in);
        br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        //StringTokenizer st;//=new StringTokenizer(br.readLine());
        //////////////////////////////////////////////////////////////////////////////////////
	
        int r=ni();
        int c=ni();
        int arr[]=new int[r*c];
        for(int i=0;i<r*c;i++)
        {
            arr[i]=ni();
        }
        int ans=GetWaterLevel(r,c,arr);
        out.println(ans);
        
        //////////////////////////////////////////////////////////////////////////////////////
	out.close();
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    
    private static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    private static class pair implements Comparable<pair>
    {
        int first;
        int second;
        pair()
        {
            first=0;
            second=0;
        }
        pair(int f,int s)
        {
            first=f;
            second=s;
        }

        public int compareTo(pair o)
        {
            if(first+second >  o.first+o.second)
                return 1;
            else if(first+second < o.first+o.second)
                return -1;
            else
                return 0;
        }
    }
    
    public static Integer ni() throws Exception
    {
        if(!st.hasMoreTokens())
            st=new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }
    public static BigInteger nb()throws Exception
    {
        if(!st.hasMoreElements())
            st=new StringTokenizer(br.readLine());
        return BigInteger.valueOf(Long.parseLong(st.nextToken()));
    }
    public static Long nl() throws Exception
    {
        if(!st.hasMoreTokens())
            st=new StringTokenizer(br.readLine());
        return Long.parseLong(st.nextToken());
    }
    public static Double nd()throws Exception
    {
        if(!st.hasMoreElements())
            st=new StringTokenizer(br.readLine());
        return Double.parseDouble(st.nextToken());
    }
    public static String ns()throws Exception
    {
        if(!st.hasMoreElements())
            st=new StringTokenizer(br.readLine());
        return st.nextToken();
    }
}