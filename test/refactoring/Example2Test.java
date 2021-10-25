package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {

    @Test
    void getPrice() {
        double actual = new Example2().getPrice(3, 20.0);
        double expected = 58.8;
        assertEquals(expected, actual);

        actual = new Example2().getPrice(300, 20.0);
        expected = 5700;
        assertEquals(expected, actual);
    }
}