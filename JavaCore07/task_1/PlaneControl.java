package JavaCore07.task_1;

public class PlaneControl {
	
	public void moveUp() {
		System.out.println("Літак піднявся вверх " + Move.move() + " км");
	}
	public void moveDown() {
		System.out.println("Літак опустився вниз " + Move.move() + " км");
	}
	public void moveForward() {
		System.out.println("Літак пролетів вперед " + Move.move() + " км");
	}
	public void moveBack() {
		System.out.println("Літак пролетів назад " + Move.move() + " км");
	}	
}
