package com.testframework.automation.data;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ScenarioScope
public class ScenarioContext {

    private final TestDataRegistry testDataRegistry;

    private String testCaseName;
    private Map<String, Object> data;

    // ✅ Constructor injection
    public ScenarioContext(TestDataRegistry testDataRegistry) {
        this.testDataRegistry = testDataRegistry;
    }

    public void init(String testCaseName) {
        this.testCaseName = testCaseName;
        this.data = testDataRegistry.get(testCaseName);
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public <T> T get(String key, Class<T> type) {
        Object value = data.get(key);
        return value == null ? null : type.cast(value);
    }

    public Map<String, Object> getAll() {
        return data;
    }
}
