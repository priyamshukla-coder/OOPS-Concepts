package com.company;
import java.util.*;
public class This_Keyword_Prg {
    int a;
    int b;
    public  void  Intialize(int a,int b){
        this.a=a;
        this.b=b;
    }
}

class Demo5{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int b=S.nextInt();
        This_Keyword_Prg obj=new This_Keyword_Prg();
        obj.Intialize(a,b);
        System.out.println(obj.a+" "+obj.b);
    }
}
