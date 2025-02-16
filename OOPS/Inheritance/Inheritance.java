

class Animal{
    int noLegs=4;
    
    public static void eat(){
        System.out.println("The Animal is Eating");
    }
    public static void walk(){
        System.out.println("The Animal is walking");
    }
}
class Dog extends Animal{
    Boolean canBark=true;
}
public class Main{
    public static void main(String args[]){
        Animal obj1 =new Animal();
        System.out.println(obj1.noLegs);
        obj1.eat();
        obj1.walk();
        
        System.out.println("Using class dog");
        
        Dog obj2=new Dog();
        System.out.println(obj2.canBark);
        System.out.println(obj2.noLegs);
        obj2.eat();
        obj2.walk();
        
    }
}