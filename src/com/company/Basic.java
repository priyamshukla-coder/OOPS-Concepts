package com.company;
import java.util.*;
import java.lang.*;

class Shape{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(double a, double b){System.out.println(a+b);}
}
public class Basic {
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        //System.out.println(S.nextInt());
        Shape obj=new Shape();
        int a=S.nextInt();
        int b=S.nextInt();
        obj.add(a,b);
        obj.add(87.0,879.99);
    }
}
