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
	    System.out.println("input");
	    int n=sc.nextInt();
	    
	   // outer
	   for(int i=1;i<=n;i++){
	       //space
	       for(int j=1;j<=i-1;j++){
	           System.out.print(" ");
	       }
	       //Number
	       for(int j=i;j<=n;j++){
	           System.out.print(j+" ");
	       }
	       System.out.println();
	   }
	    
	    for(int i=1;i<=n-1;i++){
	       // space
	       for(int j=1;j<=n-i-1;j++){
	           System.out.print(" ");
	       }
	       //Number
	       for(int j=n-i;j<=n;j++){
	           System.out.print(j+" ");
	       }
	       System.out.println();
	    }
	}
}