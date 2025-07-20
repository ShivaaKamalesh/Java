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
		 i=1 spaces=0 j=n
		 i=2 spaces=1 j=n
		 i=3 spaces=2 j=n
		 i=4 spaces=3 j=n
		 i=5 spaces=4 j=n
		*/
		
		for(int i=1;i<=n;i++){
		  //  leading spaces
		  for(int j=1;j<i;j++){
		      System.out.print(" ");
		  }
		  for(int j=1;j<=n-i+1;j++){
		      System.out.print("*");
		  }
		  System.out.println();
		}
		
		
	}
}