package com.sda.zoo;

public class Duck extends Animal implements FlyBehavior, RunBehavior {
  void quack() {
    System.out.println("Quack quack!");
  }

  @Override
  void eat() {
    System.out.println("Duck is eating");
  }

  @Override
  void move() {
    run();
  }

  @Override
  public void fly() {
    System.out.println("Duck is flying!");
  }

  @Override
  public void run() {
    System.out.println("Duck is running.");
  }

  @Override
  public void walk() {
    System.out.println("Duck is walking.");
  }
}
