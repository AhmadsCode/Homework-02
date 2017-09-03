import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment2Test {
    @Test
    public void main() throws Exception {
        double pounds = 5;
        double kilosPerPound = 0.454;

        double expected = 2.27;
        double result = (pounds * kilosPerPound);

        assertEquals(expected, result, 0.000001);
    }

}