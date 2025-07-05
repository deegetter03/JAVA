package inheritance;

class MountainBike extends InheritanceBicycle {

	public int seatHeight;
	
	public MountainBike(int startHeight, int startSpeed,int startGear) {
		super(startSpeed, startGear);
		this.seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		
	}
}