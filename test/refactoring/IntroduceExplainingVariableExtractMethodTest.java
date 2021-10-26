package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroduceExplainingVariableExtractMethodTest {

    @Test
    void price() {
        double actual = new IntroduceExplainingVariableExtractMethod()
                .price(20, 5);
        double expected = 110.0;
        assertEquals(actual, expected);
    }
}