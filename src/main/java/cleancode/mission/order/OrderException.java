package cleancode.mission.order;

/**
 * 주문 항목 정보 예외처리
 * @since 2025-03-07
 * */
public class OrderException extends RuntimeException {
    public OrderException(String message) {
        super(message);
    }
}
