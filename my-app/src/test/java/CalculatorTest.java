import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;

import org.hamcrest.core.IsEqual;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        int result = calculator.sum(2,3);
        assertThat(result,is(equalTo(5)));
    }

    @Test
    public void testSubstract(){
        int result = calculator.substract(2,3);
        assertThat(result,is(equalTo(-1)));
    }

    @Test
    public void testMulty(){
        int result = calculator.multiply(2,3);
        assertThat(result,is(equalTo(6)));
    }

    @Test
    public void testDivide(){
        int result = calculator.divide(6,3);
        assertThat(result,is(equalTo(2)));
    }
}