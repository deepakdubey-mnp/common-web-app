package org.mnp.commonweb.util;

import org.mnp.commonweb.model.Order;
import org.mnp.commonweb.model.OrderDTO;
import org.mnp.commonweb.model.OrderMapper;

public class OrderMapperUtil {

    //map Order to OrderMapper
    public static OrderDTO mapOrderToOrderMapper(Order order) {
        OrderDTO orderMapper = new OrderDTO();
        orderMapper.setOrderId(order.getOrderId());
        orderMapper.setAutomatedEmail(order.isAutomatedEmail());
        orderMapper.setCustomerId(order.getCustomerId());
        orderMapper.setFirstName(order.getFirstName());
        orderMapper.setLastName(order.getLastName());
        orderMapper.setItems(order.getItems());
        orderMapper.setPrice(order.getPrice());
        orderMapper.setSupplierId(order.getSupplierId());
        orderMapper.setWeight(order.getWeight());
        return orderMapper;
    }

}
