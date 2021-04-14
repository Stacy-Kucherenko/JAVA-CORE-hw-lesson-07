package lviv.lgs.ua.solid;

public class Cy27 extends AirPlaneControl implements SpecialOptions {
	
	double maxSpeed; 
	String color;

	public Cy27(double length, double width, double weight, double maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
		
	}
	
	

	public double getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	
	



	



	@Override
	public String toString() {
		return "Cy27 [maxSpeed=" + maxSpeed + ", color=" + color + " " + super.toString() + "]";
	}



	@Override
	public void TurboBoost() {
		double achievedSpeed = this.maxSpeed +(int) (Math.random() * this.maxSpeed);
		System.out.println("Achieved speed of the airplane Sy-27 now is " + achievedSpeed + " km/h");
		
	}

	@Override
	public void TechnologyStealth() {
		int unvisibleTime = (int) (Math.random() * 1001);
		System.out.println("The airplane disappeared from the radar " + unvisibleTime + " minutes ");
		
	}

	@Override
	public void NuclearImpact() {
		int nuclearWarheadsAmount = (int) (Math.random() * 11);
		System.out.println("The number of nuclear warheads that will be dropped " + nuclearWarheadsAmount);
		
	}

}
