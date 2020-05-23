package com.sda.zoo;

public class Dog extends Animal implements RunBehavior {

  void woof() {
    System.out.println("Woof woof!");
  }

  @Override
  void eat() {
    System.out.println("Dog is eating");
  }

  @Override
  void move() {
    run();
  }

  @Override
  public void run() {
    System.out.println("Dog is running.");
  }

  @Override
  public void walk() {
    System.out.println("Dog is walking.");
  }
}
