package coreConcepts;

interface interf{
	
	public void m1();
	public default void display() { //default method can be called whn the class implements it
		System.out.println("hello");
	}
	public static void calc() {
		System.out.println("Hi");
	}
	
}

public class Lamdasample{
	
	public void m2() {
		int x=30;
		interf i=()->{
			System.out.println(x);
		};
		
		i.m1();
	}
	public void m3() {
		
		int y=50;
		interf i=()->{
			System.out.println(y);
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		
		Lamdasample ls=new Lamdasample();
		ls.m2();
		ls.m3();
		interf.calc();
		
		
	}

}
