/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Method{
    public static void display(){
        System.out.println("This is Polymorphism");
    }
    public static void display(int a){
        System.out.println(a);
}
}
public class Main
{
	public static void main(String[] args) {
		Method obj=new Method();
		obj.display();
		obj.display(5);
	}
}