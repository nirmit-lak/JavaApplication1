import java.io.*;
import java.util.*;



public class Main3
{
    static StringTokenizer st=new StringTokenizer("");
    static BufferedReader br;
    
    public static void main(String args[]) throws FileNotFoundException, IOException, Exception
    {
        br=new BufferedReader(new InputStreamReader(System.in));
        
	
        System.out.print("Enter the no of strings :");
        int n=Integer.parseInt(br.readLine());
        String s[]=new String[n];
        System.out.print("Enter the Strings :");
        for(int i=1;i<=n;i++)
        {
            s[i-1]=br.readLine();
        }
        System.out.print("Enter the no of words :");
        int no_of_words=Integer.parseInt(br.readLine());
        String words[]=new String[no_of_words];
        for(int i=0;i<no_of_words;i++) words[i]=br.readLine();
        int mat[][]=new int[n][no_of_words];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<no_of_words;j++)
            {
                if(s[i].indexOf(words[j])!=-1) mat[i][j]=1;
                else mat[i][j]=0;
            }
        }
        for(int i=0;i<no_of_words;i++) System.out.print("   "+words[i]);
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print("s"+(i+1)+"");
            for(int j=0;j<no_of_words;j++)
            {
                System.out.print("\t"+mat[i][j]);
            }   
            System.out.println();
        }   
    }
}