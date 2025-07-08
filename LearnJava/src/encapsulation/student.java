package encapsulation;

import constructorClass.Student;

public class student {
    private String name;
	private int age;
	private String address;
	
	//Constructor
	public student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Getter methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
	public static void main(String[] args) {

		Student john = new Student("John", 25, "17 East, Goa");
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
	}
}