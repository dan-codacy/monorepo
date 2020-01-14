package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest4 {

    @Test
    public void shouldReturnFizzForAnInputOf6() {
        assertEquals("Fizz", new FizzBuzz().fizzbuzz(6));
    }

    @Test
    public void shouldReturnBuzzForAnInputOf10() {
        assertEquals("Buzz", new FizzBuzz().fizzbuzz(10));
    }

}