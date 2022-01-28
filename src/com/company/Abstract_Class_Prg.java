package com.company;
import java.util.*;

abstract class Abstract_Class_Prg {
    public void call(){
        System.out.println("Call this number");
    }
    public abstract void message();
    public abstract void open_camera();
    public abstract void filereader();
    //As we dont know the implementation of these methods hence we make them as abstract
    //Now since abstarct methods can only be defined in Abstarct Class hence we make the class as Abstract.
}

abstract class Abstract_Class_Prg1 extends Abstract_Class_Prg{
    public void message(){
        System.out.println("Print the Message");
    }
}
//Now also creating the object of above class will give the error as Prg1 class is extending the Prg class and its all abstract methods are not implemented in this class.

class Abstract_Class_Prg2 extends Abstract_Class_Prg {
    public void message() {
        System.out.println("Print the Message");
    }

    public void open_camera() {
        System.out.println("Open the Camera");
    }

    public void filereader() {
        System.out.println("Read the file");
    }
}
class Demo6{
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        //Abstract_Class_Prg obj=new Abstract_Class_Prg();
        //Now this object cant be created as abstract class cannot be instantiated.
        //obj.call(); // here this code works fine
        //But if we want to have some more functions like message , open_camera ,filereader but we are not sure about how to implement them so we just declare those methods.
        //Abstract_Class_Prg1 obj=new Abstract_Class_Prg1()
        Abstract_Class_Prg2 obj=new Abstract_Class_Prg2();
        obj.filereader();
        obj.message();
        obj.open_camera();
        obj.call();
    }
}
