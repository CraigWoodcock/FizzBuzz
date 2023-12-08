package com.sparta.cw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @ParameterizedTest
//    @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27})
    @Test
    @DisplayName("Testing Should Return Fizz")
    public void shouldReturnFizz()
    {
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzzCheckNumber(3));
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzzCheckNumber(6));
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzzCheckNumber(9));
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzzCheckNumber(12));
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzzCheckNumber(18));
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzzCheckNumber(21));
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzzCheckNumber(24));
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzzCheckNumber(27));
    }

    @Test
    @DisplayName("Testing Should Return Buzz")
    public void shouldReturnBuzz()
    {
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzzCheckNumber(5));
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzzCheckNumber(10));
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzzCheckNumber(20));
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzzCheckNumber(25));
    }
    @Test
    @DisplayName("Testing Should Return FizzBuzz")
    public void shouldReturnFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzzCheckNumber(15));
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzzCheckNumber(30));
    }

    @Test
    @DisplayName("Testing Should Return That's not a Fizz Or a Buzz")
    public void shouldReturnNotFizzOrBuzz() {
        Assertions.assertEquals("Thats not a fizz or buzz", FizzBuzz.fizzBuzzCheckNumber(1));
        Assertions.assertEquals("Thats not a fizz or buzz", FizzBuzz.fizzBuzzCheckNumber(2));
        Assertions.assertEquals("Thats not a fizz or buzz", FizzBuzz.fizzBuzzCheckNumber(4));
        Assertions.assertEquals("Thats not a fizz or buzz", FizzBuzz.fizzBuzzCheckNumber(8));
    }
}
