package com.sda.vehicles;

public class VehicleApp {
  public static void main(String[] args) {
    System.out.println("-----------------------");
    System.out.println("Vehicle");
    Vehicle pojazd = new Vehicle();
    pojazd.run(100);

    System.out.println("-----------------------");
    System.out.println("Car");
    pojazd = new Car();
    pojazd.run(66);

    System.out.println("-----------------------");
    System.out.println("Truck");
    pojazd = new Truck();
    pojazd.run(100);

    System.out.println("-----------------------");
    runThisVehicle(new Truck());

    System.out.println("-----------------------");
    runThisVehicle(new Car());

    System.out.println("-----------------------");
    runThisVehicle(new Vehicle());
  }

  public static void runThisVehicle(Vehicle vehicle) {
    System.out.println("Running vehicle");
    vehicle.run(150);
  }
}
