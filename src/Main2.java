import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main2
{
    static StringTokenizer st=new StringTokenizer("");
    static BufferedReader br;
    ///////////////////////////////////////////////////////////////////////////////////
    
    public static void main(String args[]) throws FileNotFoundException, IOException, Exception
    {
        //Scanner in =new Scanner(new FileReader("input.txt"));
        //PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        //Scanner in=new Scanner(System.in);
        br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        //StringTokenizer st;//=new StringTokenizer(br.readLine());
        //////////////////////////////////////////////////////////////////////////////////////
	
        int n=ni();
        int arr[]=new int[n];
        int dp[]=new int[n];
        int top=0;
        for(int i=0;i<n;i++) arr[i]=ni();
        int cnt=0,no=0;
        if(n==1)
        {
            out.print(1);
            out.close();
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                cnt=1;
                no=arr[i];
            }
            else
            {
                if(no==arr[i]) cnt++;
                else
                {
                    dp[top]=cnt;
                    cnt=1;
                    top++;
                    no=arr[i];        
                }
            }
        }
        dp[top]=cnt;
        top++;
        /*for(int i=0;i<top;i++)
            out.print(dp[i]+" ");*/
        int max=0,sum=0;
        if(arr[0]==0) 
        {
            max=dp[0]+dp[1];
            for(int i=1;i<top-2;i+=2)
            {
                sum=dp[i]+dp[i+1]+dp[i+2];
                max=Math.max(max,sum);
            }
        }
        
        else
        {
            for(int i=0;i<top-2;i+=2)
            {
                sum=dp[i]+dp[i+1]+dp[i+2];
                max=Math.max(max,sum);
            }
        }
        
        out.print(max);
        //////////////////////////////////////////////////////////////////////////////////////
	out.close();
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    
    
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