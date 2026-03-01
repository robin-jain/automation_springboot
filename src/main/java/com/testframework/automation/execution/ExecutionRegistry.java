package com.testframework.automation.execution;

import java.util.Map;

public final class ExecutionRegistry {

    private static final Map<String, Boolean> EXECUTION_MAP =
            ExcelExecutionReader.read(
                    "/execution/execution-control.xlsx"
            );

    private ExecutionRegistry() {}

    public static boolean shouldExecute(String testCaseName) {

        // Default behavior: execute if not found
        return EXECUTION_MAP.getOrDefault(testCaseName, true);
    }
}
