package Interface;

public class car implements Vehicle {

	@Override
	public void start() {
System.out.println("car start");		
	}

	@Override
	public void accelerate() {
		System.out.println("car accelerate");		
		
	}

	@Override
	public void brake() {
		System.out.println("car brake");		
		
	}
}
