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
// 		upper
// outer-upper
		for(int i=1;i<=n;i++){
		  //  print left star
		  for(int j=1;j<=i;j++){
		      System.out.print("*");
		  }
		  //print space
		  for(int j=1;j<=(n-i)*2;j++){
		      System.out.print(" ");
		  }
		  //right
		  for(int j=1;j<=i;j++){
		      System.out.print("*");
		  }
		  
		  System.out.println();
		}
		
// 		lower
// outer-lower
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*i)-2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
}