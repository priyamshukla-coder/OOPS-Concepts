package com.company;
import java.util.*;
import java.lang.Math;
public class Aggregation_Program {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int r=S.nextInt();
        circle_area ob=new circle_area();
        System.out.println(ob.get_area(r));
    }
}

class calcuate_area{
    int square(int side){
        return (int) Math.pow(side,2);
    }
}

class circle_area{
    calcuate_area ca; //Aggragtion to use the concept of reusability
    public double get_area(int radius) {
        ca=new calcuate_area();
        int square_val = ca.square(radius);
        double final_area_circle = square_val * 3.14;
        return final_area_circle;
    }
}