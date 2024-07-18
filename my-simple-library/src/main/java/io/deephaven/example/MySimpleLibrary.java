package io.deephaven.example;

public class MySimpleLibrary {
    public static long addOrSubtract(long x, long y) {
        return x % 2 == 0
                ? x + y
                : x - y;
    }
}
