package com.sda.exceptions;

import java.util.List;
import java.util.Scanner;

public class GetTextExceptionApp {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);

      List<String> texts = List.of("Ala", "ma", "kota", "a", "Karol", "komputer");

      System.out.println("Choose index from 0 to " + texts.size() + ":");

      String text = scanner.nextLine();
      System.out.println("You entered: " + text);

      int index = Integer.parseInt(text);

      System.out.println("Chosen text: " + texts.get(index));
    } catch (IndexOutOfBoundsException exception) {
      System.out.println("You asked for too much!");
    } catch (RuntimeException exception) {
      System.out.println("Unknown error!");
    } finally {
      System.out.println("Exiting!");
    }
  }
}
