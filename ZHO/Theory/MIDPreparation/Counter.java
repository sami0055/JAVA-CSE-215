package MIDPreparation;

class Counter{
static int count;//will get memory when instance is created

Counter(){
count++;
System.out.println(count);
}

public static void main(String args[]){

Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();

 }
}

