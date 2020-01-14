package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest3 {

    
    @Test
    public void shouldReturn4ForAnInputOf4() {
        assertEquals("4", new FizzBuzz().fizzbuzz(4));
    }

    @Test
    public void shouldReturnBuzzForAnInputOf5() {
        assertEquals("Buzz", new FizzBuzz().fizzbuzz(5));
    }

}