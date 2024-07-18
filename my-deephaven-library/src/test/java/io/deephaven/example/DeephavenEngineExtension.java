package io.deephaven.example;

import io.deephaven.engine.testutil.QueryTableTestBase;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * This is a JUnit 5 extension that allows for the easy orchestration of the Deephaven engine for
 * testing purposes. This could eventually be provided by Deephaven.
 */
public class DeephavenEngineExtension implements BeforeEachCallback, AfterEachCallback {

    private EngineState engineState;

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        engineState = new EngineState();
        engineState.setUp();
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        engineState.tearDown();
    }

    static class EngineState extends QueryTableTestBase {}
}