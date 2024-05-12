import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderByIndex {

    @Test
    @Order(1)
    void testC() {
        System.out.println("Test C");
    }

    @Test
    @Order(4)
    void testA() {
        System.out.println("Test A");
    }

    @Test
    @Order(2)
    void testD() {
        System.out.println("Test D");
    }

    @Test
    @Order(3)
    void testB() {
        System.out.println("Test B");
    }
}
