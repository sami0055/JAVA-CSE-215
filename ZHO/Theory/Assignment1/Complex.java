package Assignment1;

public class Complex {
   private double real;
   private double imaginary;
public Complex(double real, double imaginary) {
	
	this.real = real;
	this.imaginary = imaginary;
}
public Complex() {
	this.real=0;
	this.imaginary=0;
}

public Complex add(Complex c)
{
	Complex result=new Complex();
	result.real=this.real+c.real;
	result.imaginary=this.imaginary+c.imaginary;
	return result;
}
@Override
public String toString() {
	return "Complex "+this.real+"+"+this.imaginary+"i";
}
   
}
