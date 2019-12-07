package JavaCore07.task_1;

public class Main {
	
	public static void main (String[] args) {
		
		Su27 t10 = new Su27(18000, 6000, 12000, 1150, "білий");
		
		t10.startEngines();
		t10.takeoffPlane();
		t10.moveUp();
		t10.moveForward();
		t10.moveDown();
		t10.moveBack();
		t10.becomeStealth();
		t10.nuclearStrike();
		t10.turboAccelerate();
		t10.landingPlane();
	}
}
