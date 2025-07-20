/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input");
		int n=sc.nextInt();
		
		/*
		 i=1 spaces=4 n=5 j=1
		 i=2 spaces=3 n=5 j=3
		 i=3 spaces=2 n=5 j=5
		 i=4 spaces=1 n=5 j=7
		 i=5 spaces=0 n=5 j=9
		*/
		
		for(int i=1;i<=n;i++){
		  //  spaces
		  for(int j=1;j<=n-i;j++){
		      System.out.print(" ");
		  }
		  //num
		  for(int j=1;j<=i;j++){
		      System.out.print(i+" ");
		  }
		  System.out.println();
		}
		
		
	}
}

