package cleancode.mission.order.service;

import cleancode.mission.order.model.Order;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = OrderService.class)
public class OrderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    void validateOrder(){
        List<String> items = Arrays.asList("order1", "order2");
        Order order = new Order(items, 1000, "홍길동");

        System.out.println(orderService.validateOrder(order));
    }
}
