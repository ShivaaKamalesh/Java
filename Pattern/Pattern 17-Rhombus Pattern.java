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
		
// 		outer loop
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
            }
            // star
            for(int j=1;j<=n;j++){
                 System.out.print("*");
            }
             System.out.println();
        }
        
       
	}
}