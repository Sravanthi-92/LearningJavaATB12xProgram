package OOPs_and_Exception_Handling;

public class Challenge_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person P1 =  new Person("John", 25);
		Person P2 = new Person("Alice", 30);
		P1.print_details();
		P2.print_details();
	

	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void print_details() {
		System.out.println("Name: " + name + "  " + "Age:" + age);
	}
}
