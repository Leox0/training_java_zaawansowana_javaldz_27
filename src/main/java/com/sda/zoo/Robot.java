package com.sda.zoo;

public class Robot implements RunBehavior {
  @Override
  public void run() {
    System.out.println("Robot is running!");
  }

  @Override
  public void walk() {
    System.out.println("Robot is walking!");
  }
}
