package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceMethodWithMethodObjectTest {

    @Test
    void game() {
        ReplaceMethodWithMethodObject test = new ReplaceMethodWithMethodObject();
        int actual = test.game(2, 2, 2);
        assertEquals(720, actual);
    }
}