package com.company;
import java.util.*;
public class Encapsulation_Prg {
    private int i;
    public void Setter(int val){
        i=val;
    }
    public int Getter(){
        return i;
    }
}
class Demo2{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        Encapsulation_Prg obj=new Encapsulation_Prg();
        //obj.i=n;//  Here error occurs as the type of i in above class is private hence it cannot be accesed from other class.
        //Here comes the concept of Getter and setter functions//
        obj.Setter(n);
        System.out.println(obj.Getter());
    }
}
