package com.company;
import java.util.*;
class Constructor_Prg {
    int i;
    int j;
    public Constructor_Prg(){
        i=65;
        j=868;
        System.out.println(i+" "+j);
        System.out.println(("Hello Welcome to constructors concept"));
    }
    public Constructor_Prg(int a,int b){
        System.out.println(a+b);
    }
}
class Demo{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int b=S.nextInt();
        Constructor_Prg obj=new Constructor_Prg(34,78);
        obj.i=a;
        obj.j=b;
        System.out.println(a+" "+b);

    }
}
