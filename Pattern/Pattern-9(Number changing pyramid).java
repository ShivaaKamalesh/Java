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

        int num=1;
		
		for(int i=0;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(num);
		        num++;
		    }
		    System.out.println();
		}
		
	}
}