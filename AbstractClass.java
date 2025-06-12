import java.util.*;
public class AbstractClass {
    public static void main(String[] args){
//        Horse h = new Horse();
//        h.eat();
//        h.walk();
//        System.out.println(h.color);
//        h.changeColor(); //until this method is not called color of the horse won't change and it will store default color which is defined in the Abstract class constructor
//        System.out.println(h.color);
//
//        Chicken c = new Chicken();
//        c.eat();
//        c.walk();

        Cowboy myHorse = new Cowboy();
        //NewAnimal -> Horse -> Cowboy
    }
}

abstract class NewAnimal{
    String color;
    NewAnimal(){ //Abstract constructor help to initialize a common method for all child classes, though it can be changes or modifies later in the child classes
        color = "Brown";
        System.out.println("NewAnimal constructor called");
    }
    void eat(){
        System.out.println("Animals eats..");
    }
    abstract void walk();
}

class Horse extends NewAnimal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "DarkBrown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Cowboy extends Horse{
    Cowboy(){
        System.out.println("Cowboy constructor called");
    }
}
class Chicken extends NewAnimal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
