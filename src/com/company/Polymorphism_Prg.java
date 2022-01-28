package com.company;
import java.util.*;
public class Polymorphism_Prg {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
}
class Demo3{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int b=S.nextInt();
        Polymorphism_Prg obj=new Polymorphism_Prg();
        System.out.println(obj.add(a,b));
    }
}
