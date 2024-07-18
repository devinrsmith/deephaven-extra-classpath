package io.deephaven.example;

import io.deephaven.engine.table.Table;
import io.deephaven.engine.util.TableTools;

public class MyDeephavenLibrary {

    public static Table helloWorld() {
        return TableTools.newTable(TableTools.stringCol("X", "Hello", "World!"));
    }
}
