package constructorClass;

public class CuboidConstructor {
    int width;
	int height;
	int depth;
	
	// Multiple constructor with different purposes
	
	//constructor1 - wants all entity
	CuboidConstructor(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	//constructor2 - depth is fixed
	CuboidConstructor(int width, int height){
		this.width = width;
		this.height = height;
		this.depth = 10;
	}
	
	//constructor3 - want single value for all
	CuboidConstructor(int dimension){
		width = dimension;
		height = dimension;
		depth = dimension;
	}
	
	//constructor4 - fixed value for all
	CuboidConstructor(){
		this.width = 10;
		this.height = 10;
		this.depth = 10;
	}
	
	//Behaviour
	int Volume() {
		return width * height * depth;
	}
	
	public static void main(String[] args) {
        //Creating an object of CuboidConstructor class
        //Creating multiple objects of CuboidConstructor class with different constructors and calculating the volume of each cuboid
        
		int Volume;
		
		CuboidConstructor stdCuboid = new CuboidConstructor(10, 20, 15);
		Volume = stdCuboid.Volume();
		System.out.println("Volume of simple Cuboid is: " + Volume);
		
		CuboidConstructor CuboidwithDefaultDepth = new CuboidConstructor(10, 20);
		Volume = CuboidwithDefaultDepth.Volume();
		System.out.println("Volume of Cuboid with Default Depth is: " + Volume);
		
		CuboidConstructor cube = new CuboidConstructor(12);
		Volume = cube.Volume();
		System.out.println("Volume of cube is: " + Volume);
		
		CuboidConstructor defaultCuboid = new CuboidConstructor();
		Volume = defaultCuboid.Volume();
		System.out.println("Volume of Default Cuboid is: " + Volume);
	}
}