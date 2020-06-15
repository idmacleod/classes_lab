import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void testSubtractPositive(){
        assertEquals(5, calculator.subtract(9, 4));
    }

    @Test
    public void testSubtractNegative(){
        assertEquals(-3, calculator.subtract(1,4));
    }

    @Test
    public void testMultiply(){
        assertEquals(8, calculator.multiply(2,4));
    }

    @Test
    public void testDivide(){
        assertEquals(8.6, calculator.divide(17.2, 2.0), 0.1);
    }
}
