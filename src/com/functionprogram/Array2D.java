package com.functionprogram;
import java.util.*;
public class Array2D {

	public static void main(String[] args) {
		Scanner atd =new Scanner(System.in);
        System.out.println("Enter the no. of rows :");
     	int M = atd.nextInt();
     	System.out.println("Enter the no. of coloumns :");
     	int N = atd.nextInt();
     	int a[][] = new int[M][N];
     	//Logics for printing 2D-Array
     	for(int i=0;i<M;i++)
     	{
     		for(int j=0;j<N;j++)
     		{
     			System.out.print(" "+ a[i][j]);
     		}
     			System.out.println();
     	}
     	System.out.println("Printing Elements...");  
        for(int i=0;i<3;i++)  
        {   
            System.out.println();  
            for(int j=0;j<3;j++)  
            {  
                System.out.print(a[i][j]+"\t");  
            }  
        }  
     	atd.close();
	}

}
