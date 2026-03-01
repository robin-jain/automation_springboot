package com.testframework.automation;

import com.testframework.automation.service.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestSpring001 {


//    src/test/java/com/testframework/automation/TestSpring001.java
//    src/test/java/collections/TestSpring001.java
//    src/main/java/com/testframework/automation/AutomationApplication.java
    @Autowired
    private Payment payment;

    @Test
    void testSum() {
        payment.sum();
    }


}

