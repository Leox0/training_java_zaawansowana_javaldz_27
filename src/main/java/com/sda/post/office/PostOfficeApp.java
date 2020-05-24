package com.sda.post.office;

import java.util.Scanner;

public class PostOfficeApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome!");
    System.out.println("Statuses:");

    PackageStatus[] statuses = PackageStatus.values();
    for (PackageStatus status : statuses) {
      System.out.println("Status: " + status + "; next: " + status.nextStatus());
    }

    System.out.println("Choose status:");
    String inputText = scanner.nextLine();
    try {
      PackageStatus chosenStatus = PackageStatus.valueOf(inputText.toUpperCase());
      System.out.println("Status: " + chosenStatus.getDescription());
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
