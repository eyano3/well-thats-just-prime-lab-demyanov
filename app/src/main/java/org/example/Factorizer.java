package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> factorizePrimes(Integer n) {

    ArrayList<Integer> primeFactors = new ArrayList<>();

    if (n < 2) {
      return primeFactors;
    }

    int factor = 2;

    while (n > 1) {
      if (n % factor == 0) {
        primeFactors.add(factor);
        n = n / factor;
      }
      else {
        factor++;
      }
    }
    return primeFactors;
  }
}

