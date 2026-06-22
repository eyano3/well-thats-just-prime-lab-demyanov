package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FactorizerTest {

  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();

    assertEquals(expected, factorizer.factorizePrimes(0));
  }

  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>();

    assertEquals(expected, factorizer.factorizePrimes(1));
  }

  @Test
  void itReturnsTheNumberItselfForAPrimeNumber() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7));

    assertEquals(expected, factorizer.factorizePrimes(7));
  }

  @Test
  void itReturnsRepeatedPrimeFactors() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 5, 5));

    assertEquals(expected, factorizer.factorizePrimes(100));
  }

  @Test
  void itReturnsPrimeFactorsForANumberWithManyFactors() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 3, 7));

    assertEquals(expected, factorizer.factorizePrimes(84));
  }

  @Test
  void itReturnsOnlyTwosForAPowerOfTwo() {
    Factorizer factorizer = new Factorizer();

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 2, 2));

    assertEquals(expected, factorizer.factorizePrimes(16));
  }
}
