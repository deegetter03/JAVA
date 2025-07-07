package multipleinheritance;
//class can extends only from one base class,but can implements any number of interfaces

class MountainBike extends TwoWheeler implements Bicycle, Vehicle{
	
	private int seatHeight;
	private int gear;
	private int speed;
	
	//we do not need constructor in interfaces because there is nothing to initialize
	
	public MountainBike(int startHeight, int startSpeed, int startGear) {
		seatHeight = startHeight;
		speed = startSpeed;
		gear = startGear;
	}

	@Override
	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void canDrive() {
		System.out.println("Mountain bike can be driven");
	}
}