package methodOveriding;

public class MethodOverridingDemo {
    public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(10, 2);
		
		System.out.println("Bicycle gear is: " + bicycle.gear);
		System.out.println("Bicycle speed is: " + bicycle.speed);
		bicycle.applyBrake(3);
		System.out.println("Bicycle speed after applying break is: " + bicycle.speed);
		
		Bicycle mountainBike = new MountainBike(50, 40, 4);
		System.out.println("MountainBike Gear is: " + mountainBike.gear);
		System.out.println("MountainBike speed is: " + mountainBike.speed);
		mountainBike.applyBrake(3);

	}
}