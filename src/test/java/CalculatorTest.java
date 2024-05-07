import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test math operations in Calculator class")
class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("Executing @BeforeAll method");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Executing @AfterAll method");
    }

    @BeforeEach
    void beforeEachTestMethod() {
        System.out.println("Executing @BeforeEach method");
        calculator = new Calculator();
    }

    // test<System under test>_<Condition or state change>_<Expected result>
    @Test
    @DisplayName("Test 6/2 = 3")
    void testIntegerDivision_whenSixIsDividedByTwo_shouldReturnThree() {

        // Arrange
        int expectedResult = 3;
        int dividend = 6;
        int divisor = 2;

        // Act
        int actualResult = calculator.integerDivision(dividend, divisor);

        // Assert
        assertEquals(expectedResult, actualResult, "6/2 did not produce 3");
    }

    @Test
    @DisplayName("Division by zero")
    void testIntegerDivision_whenDividendIsDividedByZero_shouldThrowArithmeticException() {
        // Arrange
        int divisor = 0;
        int dividend = 10;
        String expectedExceptionMessage = "/ by zero";


        // Act & Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class, ()-> {
            // Act
            calculator.integerDivision(dividend, divisor);
        }, "Division by zero should throw ArithmeticException");

        // Assert
        assertEquals(expectedExceptionMessage, actualException.getMessage(), "Unexpected exception");
    }

    @DisplayName("Test integer substraction [minuend, substrahend, expectedResult]")
    @ParameterizedTest
    @MethodSource
    void integerSubstraction(int minuend, int substrahend, int expectedResult) {
        int actualResult = calculator.integerSubstraction(minuend, substrahend);
        assertEquals(expectedResult, actualResult, ()-> minuend + " - " + substrahend + " = " + expectedResult);
    }

    private static Stream<Arguments> integerSubstraction() {
        return Stream.of(
                Arguments.of(33, 1, 32),
                Arguments.of(54, 4, 50),
                Arguments.of(15, 5, 10)
        );
    }
}