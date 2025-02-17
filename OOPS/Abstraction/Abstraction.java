/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

abstract class Computer{
    void turnOn(){
        System.out.println("Turning On");
    }
}


class HP extends Computer{
    
}



public class Main
{
	public static void main(String[] args) {
		HP obj=new HP();
		obj.turnOn();
	}
}