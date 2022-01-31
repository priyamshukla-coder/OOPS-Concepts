package com.company;

public class Employee {
    float salary=40000;
    public void display(){
        System.out.println("Welcome to office");
    }
}
class Programmer extends Employee{
    int bonus=10000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        p.display();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
