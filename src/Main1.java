import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main1
{
    static StringTokenizer st=new StringTokenizer("");
    static BufferedReader br;
    ///////////////////////////////////////////////////////////////////////////////////
    public static int binomialCoeff(int n, int k)
    {
        int C[][]=new int[n+1][k+1];
        int i, j;
        for (i = 0; i <= n; i++)
        {
            for (j = 0; j <= Math.min(i, k); j++)
            {
                if (j == 0 || j == i)
                    C[i][j] = 1;
                else
                    C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        } 
        return C[n][k];
    }
    public static int CompanyRecruitment(int[] input1,int input2)
    {
        Arrays.sort(input1);
        int index=10-input2;
        int k=1;
        for(int i=index+1;i<10;i++)if(input1[i]==input1[index]) k++; else break;
        int n=k;
        for(int i=index-1;i>=0;i--) if(input1[i]==input1[index]) n++; else break;
        return binomialCoeff(n,k);
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
	
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
            arr[i]=ni();
        int k=ni();
        int res=CompanyRecruitment(arr,k);
        out.println(res);
        
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