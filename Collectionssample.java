package coreConcepts;

import java.util.stream.Collectors;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import coreConcepts.Overloading;
import coreConcepts.Pojo;

public class Collectionssample {
	
	public void calc() {
	int i=0;
	int c = 0;
	int key=0;
	String value =null;
	Map m=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the count");
	try {
		 c=sc.nextInt();
	}
	catch(Exception e) {
		System.out.println("plz type Integer only" +e);
		calc();
	}
	while(i<c) {
		System.out.println("Enter the Key");
		try {
			key=sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Only Integer is allowed" +e);
			calc();
		}
		
		System.out.println("Enter the value");
		try {
			  if(sc.hasNext("[A-Za-z]*")) {
		            value = sc.next();
		            System.out.println("You entered a string value "+value);
		        }
			
		}
		catch(Exception e) {
			System.out.println("Enter only String" +e);
			calc();
		}
		m.put(key, value);
		i++;
	}
	System.out.println(m);
	}


	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(1);
		ar.add("Ishaq");
		ar.add("Ahamed");
		ar.add(null);
		ar.add(19);
		ar.add(21);
		
		Iterator ra=ar.iterator();
		while(ra.hasNext()) {
			System.out.println(ra.next());
		}
		
		System.out.println(ar);
	
		List<Integer> l=new LinkedList<>();
		l.add(5);
		l.add(1);
		l.add(10);
		System.out.println(l.indexOf(7));
		System.out.println(l.indexOf(10));
		System.out.println(l.get(2));
		Collections.sort(l);
		System.out.println(l);
	
		HashSet<Integer> s=new HashSet<>();
		s.add(10);
		s.add(10);
		s.add(15);
		s.add(25);
		s.add(17);
		s.add(28);
		Iterator r=s.iterator();
		while(r.hasNext()) {
			System.out.println(r.next());
		}
		HashSet<Integer> s1=(HashSet<Integer>) s.stream().filter(x->x%2==1).collect(Collectors.toSet());
		System.out.println(s1);
		s.addAll(ar);
		System.out.println(s.contains(29));
		System.out.println(s);
		String h=Overloading.getFullName();
		System.out.println(h);
		
		TreeSet<Integer> t=new TreeSet<>();
		t.add(15);
		t.add(14);
		t.add(25);
		t.add(10);
		t.add(9); //does not allow null values
		System.out.println(t);
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t.first());
		System.out.println(t.floor(25)); //returns the greatest no in the set which is <= given no
		System.out.println(t.ceiling(12));// returns the least no in the set which is >=given no
		
		
		Collectionssample cs=new Collectionssample();
		cs.calc();
		
		
		
		
	}

}
