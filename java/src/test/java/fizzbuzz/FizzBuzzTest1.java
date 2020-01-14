package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest1 {

    @Test
    public void shouldReturn1ForAnInputOf1() {
        assertEquals("1", new FizzBuzz().fizzbuzz(1));
    }

}