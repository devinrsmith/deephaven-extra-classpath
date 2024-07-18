package io.deephaven.example;

import io.deephaven.engine.table.Table;
import io.deephaven.engine.testutil.TstUtils;
import io.deephaven.engine.util.TableTools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DeephavenEngineExtension.class)
class MyDeephavenLibraryTest {

    @Test
    void helloWorld() {
        // Yes, this is a dumb test :)
        Table expected = TableTools.newTable(TableTools.stringCol("X", "Hello", "World!"));
        TstUtils.assertTableEquals(expected, MyDeephavenLibrary.helloWorld());
    }
}
