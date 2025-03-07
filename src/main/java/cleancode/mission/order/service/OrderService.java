package cleancode.mission.order.service;

import cleancode.mission.order.model.Order;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 * 주문 항목 정보 Service
 * @since 2025-03-06
 * */
@Service
public class OrderService {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    public boolean validateOrder(Order order) {
        if (hasNoOrderItems(order)) {
            log.info("주문 항목이 없습니다.");
            return false;
        }

        if (hasValidTotalPrice(order)) {
            if (hasNoCustomerInfo(order)) {
                log.info("사용자 정보가 없습니다.");
                return false;
            }
            return true;
        }

        log.info("올바르지 않은 총 가격입니다.");
        return false;
    }

    private static boolean hasNoOrderItems(Order order) {
        return order.getItems().size() == 0;
    }

    private static boolean hasValidTotalPrice(Order order) {
        return order.getTotalPrice() > 0;
    }

    private static boolean hasNoCustomerInfo(Order order) {
        return !order.hasCustomerInfo();
    }
}
