package com.sda.box;

import java.time.LocalDate;

public class BoxApp {
  public static void main(String[] args) {
    Box<String> nameBox = new Box<>("Karol");
    String element = nameBox.get();
    System.out.println(element);

    Box<LocalDate> dateBox = new Box<>(LocalDate.now());
    LocalDate date = dateBox.get();
    System.out.println(date);

    Box rawBox = new Box("Karol");
    Object string = rawBox.get();
    System.out.println(string);
  }
}
