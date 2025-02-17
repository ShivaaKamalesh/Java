/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Son s=new Son();
		System.out.println(s.Gender);
		s.print();
	}
}

class Father{
    char Gender='M';
    
    void print(){
        System.out.println("Parent Class");
    }
}

class Son extends Father{
    
}