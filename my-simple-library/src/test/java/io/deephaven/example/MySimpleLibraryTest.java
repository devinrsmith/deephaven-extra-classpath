package io.deephaven.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MySimpleLibraryTest {
    @Test
    void evenX() {
        Assertions.assertEquals(45, MySimpleLibrary.addOrSubtract(42, 3));
    }

    @Test
    void oddX() {
        Assertions.assertEquals(40, MySimpleLibrary.addOrSubtract(41, 1));
    }
}
