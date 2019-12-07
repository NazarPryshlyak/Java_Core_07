package JavaCore07.task_1;

public class Su27 extends Plane implements TurboAcceleration, StealthTechnology, NuclearStrike {

	int maxSpeed;
	String color;
	
	public Su27(int lenght, int height, int weight, int maxSpeed, String color) {
		super(lenght, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void nuclearStrike() {
		int bombsAmount = (int) (Math.random() * (10 + 1));
		System.out.println("Активована функція ядерного удару.На ціль буде скинуто " + bombsAmount + " боєголовок");
		
	}

	@Override
	public void turboAccelerate() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
		System.out.println("Запущено Турбо прискорення. Швидкість літака " + accSpeed + " км/год");
		
	}

	@Override
	public void becomeStealth() {
		int unvisibleTime = (int) (Math.random() * 1000);
		System.out.println("Запущено технологію Стелс. Літак зникне з радару на " + unvisibleTime + " сек");
	}
}
