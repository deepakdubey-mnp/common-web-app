package org.mnp.commonweb.service;

import org.mnp.commonweb.model.Order;
import org.mnp.commonweb.model.OrderDTO;
import org.mnp.commonweb.model.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, OrderDTO> kafkaTemplate;

    private static final String TOPIC = "order";


    public void sendOrder(OrderDTO order) {
        kafkaTemplate.send(TOPIC, order);
    }
}