package OOPs_and_Exception_Handling;

public class Challenge_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Bob", 101, 'A');
		s1.print_details();
		

	}

}

class Student {
	String name;
	int r_No;
	char section;
	
	Student( String name, int r_No, char section){
		this.name = name;
		this.r_No = r_No;
		this.section = section;
	}
	
	public void print_details() {
		System.out.println("Student: " + name + ", Roll No :" + r_No + ", section: " + section);
	}
}
