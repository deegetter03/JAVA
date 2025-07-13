package methodCalling;

public class Student {
    String name;
	int age;
	String address;
	
	//Constructor -- helps to initialize the class multiple times 
	public Student(String name, int age, String address) {
		// this - refers to current object
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//setter method - to insert or fill details
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//getter method - to return/receive/read the value provided
	public String getName() {
		//return this.name;  --is also same
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	//new - used to initialize anything in java
	
	public static void main(String[] args) {

		Student john = new Student("John", 25, "17 East, Goa");
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
	}
}