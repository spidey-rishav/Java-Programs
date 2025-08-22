import java.util.*;

public class ClassesAndObject {
    public static void main(String[] args){
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

//        p1.setColor("Yellow");
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

//        BankAccount myAcc = new BankAccount();
//        myAcc.userName = "Rishav";
//        myAcc.setPassword("Hellobrother");
    }
}

//class BankAccount{
//    public String userName;
//    private String password; //password cannot be accessed outside the BankAccount class as it is defined by the private access modifiers
//
//
//    public void setPassword(String pswd){ //access modifiers of this function could by default also
//        password = pswd;
//    }
//}

class Pen{
    private String color;
    private int tip;

    String getColor(){ //getter
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){ //setter
        this.tip = newTip;
    }
}


//class Student{
//    String name;
//    int age;
//    float percentage;
//
//    void calcPercentage(int phy, int chem, int math){
//        percentage = (phy + chem + math)/3;
//        System.out.println(percentage);
//    }
//}