package Student;
 class Student1{
	 long ID;
	 String name;
	 String course;
	 double m1,m2,m3;
	public double total(){
		 return m1+m2+m3;

	}
	public double average() {
		return this.total()/3;
	}
	public String grade() {
		if(this.total()>=92) {
			return "A";
		}
		else if(this.total()>=90) {
			return "A-";
		}
		else 
			return "F";
		
	}
	@Override
	public String toString() {
		return "Student1 [ID=" + ID + ", name=" + name + ", course=" + course + ", m1=" + m1 + ", m2=" + m2 + ", m3="
				+ m3 + "]";
	}
 }
public class Student {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.course="CSE173";
		s1.ID=2234535;
		s1.name="Samiul ALim";
		s1.m1=99;
		s1.m2=88;
		s1.m3=92;
	    System.out.println(s1.total());
	    System.out.println(s1.average());
	    System.out.println(s1.grade());
	    System.out.println(s1);
		

	}

}
