package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTempWithQueruTest {

    @Test
    void getPrice() {
        double actual = new ReplaceTempWithQueru().getPrice(3, 20);
        double expected = 58.8;
        assertEquals(expected, actual);

        actual = new ReplaceTempWithQueru().getPrice(300, 20);
        expected = 5700;
        assertEquals(expected, actual);
    }
}