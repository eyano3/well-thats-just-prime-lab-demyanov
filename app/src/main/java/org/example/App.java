package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the prime factorizer!");
    System.out.print("Enter an integer to get started: ");

    int value = scanner.nextInt();
    scanner.close();

    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> factors = factorizer.factorizePrimes(value);

    System.out.println("The prime factors of " + value + " are: " + factors);
    System.out.println("Thank you for using the prime factorizer!");

  }
}
