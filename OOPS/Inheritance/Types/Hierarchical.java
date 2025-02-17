/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    Mother m=new Mother();
		System.out.println(m.Gender);
		m.print();
		
		Uncle u=new Uncle();
		System.out.println(u.Gender);
		u.print();
	}
}

class GrandFather{
    char Gender='M';
    
    void print(){
        System.out.println("Parent Class");
    }
}


class Mother extends GrandFather{
    char Gender='F';
}

class Uncle extends GrandFather{
    char Gender='M';
}