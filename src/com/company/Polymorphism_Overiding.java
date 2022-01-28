package com.company;
import java.util.*;
public class Polymorphism_Overiding {
    public void Display(){
        System.out.println("Hello World");
    }
}

class Program extends Polymorphism_Overiding{
    public void Display(){
        System.out.println("Welcome to the Programming World of JAVA");
    }
}

class Demo4{
    public static void main(String args[]){
        Program obj=new Program();
        obj.Display();
    }
}