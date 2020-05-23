package com.sda.zoo;

public class GroundApp {
  public static void main(String[] args) {
    Ground ground = new Ground();

    Dog dog = new Dog();
    ground.runOnGround(dog);

    Duck duck = new Duck();
    ground.runOnGround(duck);

    Robot robot = new Robot();
    ground.runOnGround(robot);
  }
}
