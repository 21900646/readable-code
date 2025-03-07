package cleancode.mission.order.service;

import cleancode.mission.order.OrderException;
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
        try{
            if (order.hasNoOrderItems()) {
                throw new OrderException("주문 항목이 없습니다.");
            }

            if (order.hasInValidTotalPrice()) {
                throw new OrderException("올바르지 않은 총 가격입니다.");
            }

            if (order.hasNoCustomerInfo()) {
                throw new OrderException("사용자 정보가 없습니다.");
            }
        } catch (OrderException e){
            log.info(e.getMessage());
            return false;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
