import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in Calculator class")
class CalculatorTest {

    // test<System under test>_<Condition or state change>_<Expected result>
    @Test
    @DisplayName("Test 6/2 = 3")
    void testIntegerDivision_whenSixIsDividedByTwo_shouldReturnThree() {
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(6, 2);
        assertEquals(3, result, "6/2 did not produce 3");
    }

    @Test
    @DisplayName("Division by zero")
    void testIntegerDivision_whenDividendIsDividedByZero_shouldThrowArithmeticException() {
        fail("Not implemented");
    }

    @Test
    @DisplayName("Test 15-5 = 10")
    void integerSubstraction() {
        Calculator calculator = new Calculator();
        int result = calculator.integerSubstraction(15, 5);
        assertEquals(10, result);
    }
}