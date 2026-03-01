package com.testframework.automation.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testframework.automation.utils.EnvironmentUtil;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class TestDataRegistry {

    private final EnvironmentUtil environmentUtil;
    private final ObjectMapper mapper = new ObjectMapper();

    private final Map<String, Map<String, Object>> DATA =
            new ConcurrentHashMap<>();

    public TestDataRegistry(EnvironmentUtil environmentUtil) {
        this.environmentUtil = environmentUtil;
    }

    @PostConstruct
    public void init() {
        String env = environmentUtil.getEnv();

        loadWithEnv("trade", env);
        loadWithEnv("login", env);
        loadWithEnv("loan", env);
        loadWithEnv("rate", env);
    }

    private void loadWithEnv(String module, String env) {
        load("/testdata/" + module + ".json");
        load("/testdata/" + module + "-" + env + ".json");
    }

    private void load(String path) {
        try (InputStream is = getClass().getResourceAsStream(path)) {

            if (is == null) return;

            Map<String, Map<String, Object>> fileData =
                    mapper.readValue(is, new TypeReference<>() {});

            DATA.putAll(fileData);

        } catch (Exception e) {
            throw new RuntimeException(
                    "Failed loading test data from " + path, e
            );
        }
    }

    // ✅ INSTANCE METHOD (NOT STATIC)
    public Map<String, Object> get(String testCaseName) {

        Map<String, Object> data = DATA.get(testCaseName);

        if (data == null) {
            throw new RuntimeException(
                    "No test data found for test case: " + testCaseName
            );
        }
        return data;
    }
}
