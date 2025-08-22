package packageone;

public class Constructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "rishav";
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
//        System.out.println(s1.name);

//        packageone.Student s2 = new packageone.Student("Rishav");
//        packageone.Student s3 = new packageone.Student(21);


    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
//    packageone.Student(packageone.Student s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.password = s1.password;
//        this.marks = s1.marks;
//    }

    //deep copy constructor
    Student(Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;

        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(){
        marks = new int[3];
        System.out.println("constructor is called....");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
