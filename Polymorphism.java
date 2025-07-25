class Vehicle {
	private String vNumber;

	public Vehicle(String vNumber) {
		this.vNumber = vNumber;
	}

	public String getVehicleNumber() {
		return vNumber;
	}

	public void honk() {
		System.out.println("Vehicle " + vNumber + " is honking!");
	}
}

class Car extends Vehicle {
	public Car(String carNumber) {
		super(carNumber);
	}

	@Override
	public void honk() {
		System.out.println("Car " + super.getVehicleNumber() + " is honking!!");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Vehicle car = new Car("CAR123");
		car.honk();
	}
}