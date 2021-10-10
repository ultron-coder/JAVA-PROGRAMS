package oopsConcepts;

//IS-A Relationship

//Single Inheritance

//class ParentClass{
//	int i = 5;
//	int j = 10;
//	void sum() {
//		int total = i + j;
//		System.out.println(total);
//	}
//}
//
//class SubClass extends ParentClass{
//	void display() {
//		System.out.println("problem solved");
//	}
//}
//
//public class TypesOfInheritance {
//
//	public static void main(String[] args) {
//		
//		SubClass ps = new SubClass();
//		ps.sum();
//		ps.display();
//	}
//
//}

//Multi Level Inheritance with method overloading and overriding concept

//class ParentClass{
//	int i = 5;
//	int j = 10;
//	void sum() {
//		int total = i + j;
//		System.out.println(total);
//	}
//}
//
//class SubClassOne extends ParentClass{
//	void display() {						 
//		System.out.println("From One");								
//	}										
//	void display(int k) {					
//		i = k;		
//	}
//}
//
//class SubClassTwo extends SubClassOne{
//	void  display() {
//		super.display();
//		super.display(5);
//		System.out.println("From Two");
//	}
//}
//
//public class TypesOfInheritance {
//
//	public static void main(String[] args) {
//		
//		SubClassTwo ps = new SubClassTwo();
//		ps.sum();
//		ps.display();
//	}
//
//}

//Hierarchical Inheritance

//class ParentClass{
//	int i = 5;
//	int j = 10;
//	void sum() {
//		int total = i + j;
//		System.out.println(total);
//	}
//}
//
//class SubClassOne extends ParentClass{
//	void display() {						 
//		System.out.println("From One");								
//	}										
//}
//
//class SubClassTwo extends ParentClass{
//	void  display() {
//		System.out.println("From Two");
//	}
//}
//
//public class TypesOfInheritance {
//
//	public static void main(String[] args) {
//		
//		SubClassOne so = new SubClassOne();
//		so.sum();
//		so.display();
//		
//		SubClassTwo st = new SubClassTwo();
//		st.sum();
//		st.display();
//	}
//}

//HAS-A Relationship

class ParentClass{
	int i = 5;
	int j = 10;
	public int sum() {
		int total = i + j;
		return total;
	}
}

class SubClassOne{
	ParentClass pc;
	public void display() {
		pc = new ParentClass();
		int k = pc.sum();
		int multiply = k * k;
		System.out.println(multiply);			
	}										
}

public class TypesOfInheritance {

	public static void main(String[] args) {
		new SubClassOne().display();
	}
}