class Vehicle {
  private String vehicleNumber;
  private String vehicleType;

  public Vehicle(String vehicleNumber, String vehicleType) {
    this.vehicleNumber = vehicleNumber;
    this.vehicleType = vehicleType;
  }

  public void getVehicleNumber() {
    System.out.println("Vehicle Number: " + vehicleNumber);
  }

  public void honk() {
    System.out.println(vehicleType + " is honking!");
  }
}

class Car extends Vehicle {
  public Car(String carNumber) {
    super(carNumber, "Car");
  }
}

class Bike extends Vehicle {
  public Bike(String bikeNumber) {
    super(bikeNumber, "Bike");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Car car = new Car("CAR123");
    car.getVehicleNumber();
    car.honk();

    Bike bike = new Bike("BIKE456");
    bike.getVehicleNumber();
    bike.honk();
  }
}
