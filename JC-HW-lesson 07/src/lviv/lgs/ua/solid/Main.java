package lviv.lgs.ua.solid;

public class Main {
	
	public static void main(String[] args) {
		Cy27 c27 = new Cy27(22, 27, 35, 2650, "white");
		System.out.println(c27);
		
		c27.engineOn();
		c27.takeOff();
		c27.moveUP();
		c27.moveDown();
		c27.moveLeft();
		c27.moveRight();
		c27.TechnologyStealth();
		c27.NuclearImpact();
		c27.TurboBoost();
		c27.landing();
	}
	
	
	

}
