package seminars.five;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    //5.1.
    @Test
    void checkNumbsList() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        List<Integer> listNumbs = randomNumberModule.generatorListNumbs();

        assertThat(listNumbs.size()).isEqualTo(10);
    }

    @Test
    void checkMaxInList() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        List<Integer> numbsTestList = new ArrayList<>(Arrays.asList(10, 15, 150, 10, 111, 112, 321, 211, 222, 333));

        assertThat(maxNumberModule.maxInListInt(numbsTestList)).isEqualTo(333);
    }

    @Test
    void checkMaxRandomTest() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        List<Integer> listNumbs = randomNumberModule.generatorListNumbs();
        int max = maxNumberModule.maxInListInt(listNumbs);

        assertThat(max).isEqualTo(Collections.max(listNumbs));
    }

    //5.2.
    @ParameterizedTest
    @ValueSource(ints = {1, 2, -100, 10})
    void testUserIntegration(int id) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(id); // .. 3
        assertEquals("User " + id, result);
    }

    @Test
    void testPayment(){
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);
        assertTrue(orderService.placeOrder("10",120));
    }

    //5.3.

}
