/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nirmit
 */

import java.util.Scanner;

public class XOR {

	public static void main(String[] args){
		int column;
                long row;
		Scanner sc = new Scanner(System.in);
		column = sc.nextInt();
		row = sc.nextLong();
		
		//int[][] mat = new int[row][column];
                long mat[][]=new long[2][column];
                
		/*for(int i=0;i<1;i++){
			for(int j=0;j<column;j++){
				mat[i][j] = sc.nextInt();
			}
			
		}*/
                for(int i=0;i<column;i++)
                {
                    mat[0][i]=sc.nextLong();
                }
		int j;
		/*for(int i=1;i<row;i++){
			//System.out.println("hello world");
			for(j=0;j<column-1;j++){
				
				mat[i][j] = (mat[i-1][j]^mat[i-1][j+1]);
				
				
			}
			mat[i][column-1] = mat[i-1][column-1]^mat[i-1][0];
			
		}*/
                for(j=1;j<row;j++)
                {
                    for(int i=0;i<column-1;i++)
                    {
                        mat[j%2][i]=(mat[(j+1)%2][i])^(mat[(j+1)%2][i+1]);
                    }
                    mat[j%2][column-1]=(mat[(j+1)%2][0])^(mat[(j+1)%2][column-1]);
                }
		/*for(int i=1;i<row;i++){
			
			for(j=0;j<column;j++){
				System.out.print(mat[i][j]+" ");
				
			}System.out.println();
		}*/
                StringBuilder ans=new StringBuilder("");
                long k=(row+1)%2;
                int k1=(int)k;
                for(int i=0;i<column;i++)
                {
                    
                    ans.append(mat[k1][i]+" ");
                    //System.out.print(mat[(int)k][i]+" ");
                }
                System.out.print(ans);
	}
}
