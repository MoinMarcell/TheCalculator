import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add() {
        //GIVEN
        BigDecimal bigDecimal1 = new BigDecimal(3);
        BigDecimal bigDecimal2 = new BigDecimal(6);
        BigDecimal expected = bigDecimal1.add(bigDecimal2);
        //WHEN
        BigDecimal actual = Calculator.add(bigDecimal1, bigDecimal2);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void sub() {
        BigDecimal bigDecimal1 = new BigDecimal(3);
        BigDecimal bigDecimal2 = new BigDecimal(6);
        BigDecimal expected = bigDecimal2.subtract(bigDecimal1);
        //WHEN
        BigDecimal actual = Calculator.sub(bigDecimal2, bigDecimal1);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void divide(){
        BigDecimal nominator = new BigDecimal("0.3");
        BigDecimal denominator = new BigDecimal("0.1");
        BigDecimal expected = nominator.divide(denominator, MathContext.DECIMAL32);

        BigDecimal actual = Calculator.divide(nominator, denominator);

        assertEquals(expected, actual);
    }

    @Test
    void when_denominator_zero_then_return_zero(){
        BigDecimal nominator = new BigDecimal(4);
        BigDecimal denominator = new BigDecimal(0);
        BigDecimal expected = new BigDecimal(0);

        BigDecimal actual = Calculator.divide(nominator, denominator);

        assertEquals(expected, actual);
    }

    @Test
    void multiply(){
        BigDecimal bigDecimal1 = new BigDecimal("0.3");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");
        BigDecimal expected = bigDecimal1.multiply(bigDecimal2, MathContext.DECIMAL32);

        BigDecimal actual = Calculator.multiply(bigDecimal1, bigDecimal2);

        assertEquals(expected, actual);
    }
}