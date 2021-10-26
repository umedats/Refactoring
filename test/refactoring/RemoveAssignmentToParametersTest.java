package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAssignmentToParametersTest {

    @Test
    void discount() {
        RemoveAssignmentToParameters test = new RemoveAssignmentToParameters();
        int actual = test.discount(51, 101, 10001);
        int expected = 44;
        assertEquals(expected, actual);

        actual = test.discount(50, 100, 10000);
        expected = 50;
        assertEquals(expected, actual);

    }
}