package lviv.lgs.ua.solid;

public class AirPlaneControl extends AirPlane {

	

	public AirPlaneControl(double length, double width, double weight) {
		super(length, width, weight);
		
	}

	public void moveUP() {
		System.out.println("The airplane move up for " + Math.random() * 1000 + " km ");
	}
	
	public void moveDown() {
		System.out.println("The airplane move down for " + Math.random() * 1000 + " km" );
	}
	
	public void moveRight() {
		System.out.println("Turn right at " + Math.random() * 1000 + " km ");
	}
	
	public void moveLeft() {
		System.out.println("Turn left at " + Math.random() * 1000 + " km ");
	}

	

	@Override
	public void engineOn() {
		// TODO Auto-generated method stub
		super.engineOn();
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		super.takeOff();
	}

	
	
	
	
}
