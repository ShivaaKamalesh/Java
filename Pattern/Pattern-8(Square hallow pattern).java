/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Input");
		int n=sc.nextInt();

		
		for(int i=0;i<=n;i++){
		    for(int j=0;j<=n;j++){
		        if(i==0 || j==0 || i==n||j==n){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}