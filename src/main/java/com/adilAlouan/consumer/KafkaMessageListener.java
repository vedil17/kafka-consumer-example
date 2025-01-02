package com.adilAlouan.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "topic2",groupId = "test-group")
    public void consume1(String message) {
        logger.info("Consumer consume the message {}",message);
    }

    @KafkaListener(topics = "topic2",groupId = "test-group")
    public void consume2(String message) {
        logger.info("Consumer consume the message {}",message);
    }

    @KafkaListener(topics = "topic2",groupId = "test-group")
    public void consume3(String message) {
        logger.info("Consumer consume the message {}",message);
    }

    @KafkaListener(topics = "topic2",groupId = "test-group")
    public void consume4(String message) {
        logger.info("Consumer consume the message {}",message);
    }
}
