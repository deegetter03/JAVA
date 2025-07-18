package abstraction;

public abstract class GraphicObject {
    int x, y;
	
	GraphicObject() {
		System.out.println("Base abstract class is called here");
	}
	
	void moveTo(int newX, int newY) {
		System.out.println("move to x: " + x + "and y: " + y);
	}
	
	abstract void draw();
	abstract void resize();
}