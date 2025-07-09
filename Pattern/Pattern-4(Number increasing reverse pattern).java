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
		
// 		outerloop
        for(int i=1;i<=n;i++){
            // innerloop
            for(int  j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
	}
}