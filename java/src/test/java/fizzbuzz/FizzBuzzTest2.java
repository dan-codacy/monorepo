package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest2 {


    @Test
    public void shouldReturn2ForAnInputOf2() {
        assertEquals("2", new FizzBuzz().fizzbuzz(2));
    }

    @Test
    public void shouldReturnFizzForAnInputOf3() {
        assertEquals("Fizz", new FizzBuzz().fizzbuzz(3));
    }

}