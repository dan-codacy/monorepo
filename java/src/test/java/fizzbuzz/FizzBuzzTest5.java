package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest5 {

    @Test
    public void shouldReturnFizzBuzzForAnInputOf15() {
        assertEquals("FizzBuzz", new FizzBuzz().fizzbuzz(15));
    }

    @Test
    public void shouldReturnFizzBuzzForAnInputOf30() {
        assertEquals("FizzBuzz", new FizzBuzz().fizzbuzz(30));
    }

}