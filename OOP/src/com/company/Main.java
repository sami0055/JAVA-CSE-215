package com.company;
class pen{
    String color;
    String type;
    public void writing(){
        System.out.println("Something is writing...");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }



}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.print("Student information: ");
        System.out.println("Name"+this.name);
        System.out.println("Age: "+this.age);

    }
    class
}
public class Main {

    public static void main(String[] args) {
	    pen pen1=new pen();
        pen1.color="Blue";
        pen1.type="Gel";
        pen1.writing();
        pen1.printColor();
        pen pen2 =new pen();
        pen2.color="Red";
        pen2.type="Ballpoint";
        pen2.writing();
        pen2.printColor();
        pen2.printType();
        Student s1=new Student();
        s1.name="Sami";
        s1.age=22;
        s1.printInfo();
    }
}
