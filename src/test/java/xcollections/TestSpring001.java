package xcollections;

import com.testframework.automation.AutomationApplication;
import com.testframework.automation.service.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AutomationApplication.class)
public class TestSpring001 {

    @Autowired
    private Payment payment;

    @Test
    void testSum() {
        payment.sum();
    }


}

