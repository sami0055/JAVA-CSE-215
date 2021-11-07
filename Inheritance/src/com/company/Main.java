package com.company;

import java.net.SocketTimeoutException;

class Base{
    public int x;
    Base(){
        System.out.println("I am a constructor");
    }
    Base(int x){
        System.out.println("I am a overloaded constructor"+x);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }
    public Derived(){
      //  super(0);
        System.out.println("This is derived class constructor");
    }
    public Derived(int x,int y) {
       super(x);
        System.out.println("I am derived constructor");
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ChildOfderived extends Derived{
    ChildOfderived(){
        System.out.println("I'm child of derived class constructor");
    }
    ChildOfderived(int x,int y,int z){
        super(x,y);
        System.out.println("I am chiled constructor of derived");
    }

}
public class Main {

    public static void main(String[] args) {
	//Base b=new Base();
   // Derived d=new Derived(12,56);
    ChildOfderived ch=new ChildOfderived(3,5,76);


    }
}
