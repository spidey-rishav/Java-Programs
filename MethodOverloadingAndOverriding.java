import java.util.*;
import java.io.*;

public class MethodOverloadingAndOverriding {
    public static void main(String[] args){
//        Calculator calc = new Calculator();
//        System.out.println(calc.sum(1,2));
//        System.out.println(calc.sum((float) 2.3 , (float) 1.7));
//        System.out.println(calc.sum(1, 2, 3));

        Deer d = new Deer();
        d.eat();
    }
}

//Method Overloading (Static) & Type of Compile Time Polymorphism
//class Calculator{
//    int sum(int a, int b){
//        return a + b;
//    }
//    float sum (float a , float b){
//        return  a + b;
//    }
//    int sum(int a , int b, int c){
//        return a + b + c;
//    }
//}


class Animals{
    void eat(){
        System.out.println("Eat Anything...");
    }
}

class Deer extends Animals{
    void eat(){
        System.out.println("Eat grass..");
    }
}