package lviv.lgs.ua.solid;

public abstract class AirPlane {

	private double length;
	private double width;
	private double weight; 
	
	
	
	public AirPlane(double length, double width, double weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	

	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}

	


	@Override
	public String toString() {
		return "Airplane dimensions  [length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}



	public void engineOn() {
		int a = 20 +  (int) (Math.random()* 69);
		System.out.println("Engine on - " + a + " minutes left to be ready to fly");
	}
	
	public void takeOff() {
		double b = Math.random() *1001;
		System.out.println("The plane took off. Fuel left on " + b + " km ");
	}
	
	public void landing() {
		System.out.println("The airplane is landing");
	}
}
