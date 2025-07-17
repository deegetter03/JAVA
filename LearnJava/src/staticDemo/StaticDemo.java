package staticDemo;

public class StaticDemo {
    public static void main(String[] args) {
		Student john = new Student("John", 25, "17 East, Goa");
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		
		//instance way to access something,not static way
		//System.out.println(john.college);
		
		//static way- access with class name not by object name
		//static variable belongs to class not objects
		System.out.println(Student.college);
	}
}