/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    Daughter s=new Daughter();
		System.out.println(s.Gender);
		s.print();
// 		s.printt();
	}
}

class GrandFather{
    char Gender='M';
    
    void print(){
        System.out.println("Parent Class");
    }
}

// class Father extends GrandFather{
//     void printt(){
//         System.out.println("2nd Parent Class");
//     }
// }

class Mother extends GrandFather{
    char Gender='F';
}

class Daughter extends Mother{
    
}