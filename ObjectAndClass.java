package oopsConcepts;

public class ObjectAndClass {
	
	int employeeId;
	String employeeName;
	
	public ObjectAndClass() {
		super();
	}

	public ObjectAndClass(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public void methodInitializer(int id, String name) {
		employeeId = id;
		employeeName = name;
	}
	
	public void methodForAnonymousObject() {
		System.out.println("Employee ID: "+employeeId+" is updated successfully.");
	}
	
	public void display() {
		System.out.println("Employee ID: "+employeeId+" and Employee Name: "+employeeName+" is updated successfully.");
	}
	

	public static void main(String[] args) {
		
		ObjectAndClass oc = new ObjectAndClass();
		
		//through variable reference
		
		oc.employeeId = 1608;
		oc.employeeName = "Ismail";
		oc.display();
		
		//through method reference
		
		oc.methodInitializer(1608, "Faris");
		oc.display();
		
		//through constructor reference
		
		ObjectAndClass oac = new ObjectAndClass(1608, "Ismail Faris");
		oac.display();
		
		//anonymous object
		
		new ObjectAndClass(1608, "Faris").methodForAnonymousObject();
		
	}

}
