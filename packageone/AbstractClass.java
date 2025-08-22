package packageone;

public class AbstractClass {
    public static void main(String[] args){
//        packageone.Horse h = new packageone.Horse();
//        h.eat();
//        h.walk();
//        System.out.println(h.color);
//        h.changeColor(); //until this method is not called color of the horse won't change and it will store default color which is defined in the Abstract class constructor
//        System.out.println(h.color);
//
//        packageone.Chicken c = new packageone.Chicken();
//        c.eat();
//        c.walk();

        Cowboy myHorse = new Cowboy();
        //packageone.NewAnimal -> packageone.Horse -> packageone.Cowboy
    }
}

abstract class NewAnimal{
    String color;
    NewAnimal(){ //Abstract constructor help to initialize a common method for all child classes, though it can be changes or modifies later in the child classes
        color = "Brown";
        System.out.println("packageone.NewAnimal constructor called");
    }
    void eat(){
        System.out.println("packageone.Animals eats..");
    }
    abstract void walk();
}

class Horse extends NewAnimal{
    Horse(){
        System.out.println("packageone.Horse constructor called");
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
        System.out.println("packageone.Cowboy constructor called");
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
