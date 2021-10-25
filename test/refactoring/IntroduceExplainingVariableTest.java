package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroduceExplainingVariableTest {

    @Test
    void price() {
        double actual = new IntroduceExplainingVariable().price(20, 5);
        double expected = 110.0;
        assertEquals(actual, expected);
    }
}