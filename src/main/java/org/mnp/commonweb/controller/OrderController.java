package org.mnp.commonweb.controller;

import org.mnp.commonweb.model.Order;
import org.mnp.commonweb.service.KafkaProducerService;
import org.mnp.commonweb.util.OrderMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private KafkaProducerService kafkaProducerService;


    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        kafkaProducerService.sendOrder(OrderMapperUtil.mapOrderToOrderMapper(order));
        return ResponseEntity.ok("Order sent to Kafka");
    }
}