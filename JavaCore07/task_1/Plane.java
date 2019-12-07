package JavaCore07.task_1;

public abstract class Plane {
	
	private int lenght;
	private int height;
	private int weight;
	
	private PlaneControl planeControl = new PlaneControl();

	public Plane(int lenght, int height, int weight) {
		this.lenght = lenght;
		this.height = height;
		this.weight = weight;
	}
	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void startEngines() {
		int countdown = 20 + (int) (Math.random() * (68+1));
		System.out.println("Запускаю двигуни.Взліт можливий через " + countdown + " сек");
	}
	
	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("Взліт.Літак пролетить на повному баці " + distance + "км");
	}
	
	public void landingPlane() {
		System.out.println("Приготуватися до посадки.Начинаю зниження");
	}
	
	public void moveUp() {
		planeControl.moveUp();
	}

	public void moveDown() {
		planeControl.moveDown();
	}

	public void moveForward() {
		planeControl.moveForward();
	}

	public void moveBack() {
		planeControl.moveBack();
	}
}
