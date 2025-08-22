import java.util.*;
public class Inheritance {
    public static void main(String[] args){
//        Fish shark = new Fish();
//        shark.eat();

//        Dog simba = new Dog();
//
//        simba.eat();
//        simba.legs = 4;
//        System.out.println(simba.legs);

        Bird bird = new Bird();

        bird.breathe();
    }
}


//Base Class
class Animal{
    Animal(){
        System.out.println("Animal constructor called"); //to see the use of Super keyword in Bird Class
    }
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe (){
        System.out.println("breathe..");
    }
}

//Derived Class || subClass of Animal || also known as child Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}

class Mammals extends Animal{
    int legs;

    void birth(){
        System.out.println("Give Birth to child instead of egg..");
    }
}

class Bird extends Animal{
    Bird(){
        super(); // to access the properties of the parent class which is "Animal" here.
        System.out.println("Bird Constructor called");
    }
    void fly(){
        System.out.println("Can fly...");
    }
}

//class Dog extends Mammals{
//    String breed;
//    boolean pet;
//}