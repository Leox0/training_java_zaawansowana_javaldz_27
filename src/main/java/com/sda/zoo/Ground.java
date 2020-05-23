package com.sda.zoo;

public class Ground {
  void runOnGround(RunBehavior runBehavior) {
    System.out.println("Got something that is running on me!");
    runBehavior.run();
  }

  void walkOnGround(RunBehavior runBehavior) {
    System.out.println("Got something that is walking on me!");
    runBehavior.walk();
  }
}
