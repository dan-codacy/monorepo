package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void shouldReturn1ForAnInputOf1() {
        assertEquals("1", new FizzBuzz().fizzbuzz(1));
    }

    @Test
    public void shouldReturn2ForAnInputOf2() {
        assertEquals("2", new FizzBuzz().fizzbuzz(2));
    }

    @Test
    public void shouldReturnFizzForAnInputOf3() {
        assertEquals("Fizz", new FizzBuzz().fizzbuzz(3));
    }

    @Test
    public void shouldReturn4ForAnInputOf4() {
        assertEquals("4", new FizzBuzz().fizzbuzz(4));
    }

    @Test
    public void shouldReturnBuzzForAnInputOf5() {
        assertEquals("Buzz", new FizzBuzz().fizzbuzz(5));
    }

    @Test
    public void shouldReturnFizzForAnInputOf6() {
        assertEquals("Fizz", new FizzBuzz().fizzbuzz(6));
    }

    @Test
    public void shouldReturnBuzzForAnInputOf10() {
        assertEquals("Buzz", new FizzBuzz().fizzbuzz(10));
    }

    @Test
    public void shouldReturnFizzBuzzForAnInputOf15() {
        assertEquals("FizzBuzz", new FizzBuzz().fizzbuzz(15));
    }

    @Test
    public void shouldReturnFizzBuzzForAnInputOf30() {
        assertEquals("FizzBuzz", new FizzBuzz().fizzbuzz(30));
    }

}