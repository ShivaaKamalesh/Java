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
// 		upper
// 		outer loop-upper
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                 System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                 System.out.print("*" +" ");
            }
             System.out.println();
        }       
        // lower
        // lower-outer
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                 System.out.print("  ");
            }
            for(int j=1;j<=(n-i)*2-1;j++){
                 System.out.print("*" +" ");
            }
             System.out.println();
        }
       
	}
}