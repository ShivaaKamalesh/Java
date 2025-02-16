/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;
class Employee{
    private String name;
    private int empId;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getEmpId(){
        return empId;
    }
    
    public void setEmpId(int empId){
        this.empId = empId;
}
}


class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        emp.setName(sc.nextLine());
        
        System.out.print("Enter ID: ");
        emp.setEmpId(sc.nextInt());
        System.out.println(emp.getName());
        System.out.println(emp.getEmpId());
        
    }
}