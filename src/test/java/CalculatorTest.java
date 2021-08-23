import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp()  {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(75, calculator.add(27, 48));
    }

    @Test
    public void canSubtract(){
        assertEquals(79, calculator.subtract(96, 17));
    }

    @Test
    public void canMultiply(){
        assertEquals(612, calculator.multiply(18, 34));
    }

    @Test
    public void canDivide(){
        assertEquals(49, calculator.divide(983, 20), 0.1);
    }
}

