package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitTemporaryVariableTest {

    @Test
    void getDistanceTravelled() {
        SplitTemporaryVariable splitTempVar = new SplitTemporaryVariable();
        double actual = splitTempVar.getDistanceTravelled(3);
        double expected = 12.0;
        assertEquals(expected, actual);
    }
}