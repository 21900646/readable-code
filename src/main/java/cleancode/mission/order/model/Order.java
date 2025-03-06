package cleancode.mission.order.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 주문 항목 정보 Dto
 * @since 2025-03-06
 * */
public class Order {
    private List<String> items;
    private int totalPrice;
    private String customerInfo;

    public Order(List<String> items, int totalPrice, String customerInfo) {
        this.items = items == null ? new ArrayList<>() : items;
        this.totalPrice = totalPrice;
        this.customerInfo =  customerInfo == null ? "" : customerInfo;
    }

    public List<String> getItems() {
        return items == null ? new ArrayList<>() : items;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getCustomerInfo() {
        return customerInfo;
    }

    public boolean hasCustomerInfo(){
        return this.customerInfo != null && !this.customerInfo.isEmpty();
    }
}
