package OOPs_and_Exception_Handling;

public class Challenge_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "John", 50000.0);
		System.out.println("Employee ID: " + e1.getId() + ", Employee name: " + e1.getname() + ", Employee salary: " + e1.getsalary());

	}

}

class Employee{
	private int id;
	private String name;
	private Double salary;
	public Employee(int id, String name, double salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public Double getsalary() {
		return salary;
	}
	public void setsalary(Double salary) {
		this.salary = salary;
	}
	
	
}
